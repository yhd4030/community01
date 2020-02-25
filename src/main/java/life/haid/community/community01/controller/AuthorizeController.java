package life.haid.community.community01.controller;

import life.haid.community.community01.dto.AccessTokenDTO;
import life.haid.community.community01.dto.GithubUser;
import life.haid.community.community01.model.User;
import life.haid.community.community01.provider.GithubProvider;
import life.haid.community.community01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.util.UUID;

@Controller
public class AuthorizeController {
    @Autowired/*它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。例GithubProvider githubProvider不需要再set方法
    和构造方法*/
    private GithubProvider githubProvider;/*创建GithubProvider类对象*/

    @Value("${github.client.id}")//在配置文件里去读 github.client.id里的值 并赋值到clientId
    private String clientId;

    @Value("${github.client.secret}")//在配置文件里去读 github.client.secret里的值 并赋值到clientSecret
    private String clientSecret;

    @Value("${github.redirect.uri}")//在配置文件里去读 github.redirect.uri里的值 并赋值到redirectUri
    private String redirectUri;

    @Autowired
    private UserService userService;

    @GetMapping("/callback")
    public String callbcak(@RequestParam(name="code") String code,
                           @RequestParam(name="state") String state,
                           HttpServletResponse response){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();/*创建AccessTokenDTO类对象*/
        //调用accessTokenDTO的方法
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri(redirectUri);
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);/*accessTokenDTO这里有值,返回的是一串个人码 */
        GithubUser githubUser = githubProvider.getUser(accessToken);/*user用来测试是否调用成功*/
        //登录
        if (githubUser!=null && githubUser.getId()!=null) {
            User user = new User();
            String token=UUID.randomUUID().toString();
            user.setToken(token);
            user.setName(githubUser.getName());
            user.setAccountId(String.valueOf(githubUser.getId()));

            user.setAvatarUrl(githubUser.getAvatar_url());
            userService.createOrUpdate(user);
            response.addCookie(new Cookie("token",token));//向Cookie加入数据
            return "redirect:/" ;
        }else{
            //登陆失败
            return "redirect:/" ;
        }
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request,
                       HttpServletResponse response){
        request.getSession().removeAttribute("user");
        Cookie cookie =new Cookie("token",null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "redirect:/";
    }
}
