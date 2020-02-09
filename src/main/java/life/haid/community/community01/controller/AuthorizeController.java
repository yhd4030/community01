package life.haid.community.community01.controller;

import life.haid.community.community01.dto.AccessTokenDTO;
import life.haid.community.community01.dto.GithubUser;
import life.haid.community.community01.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @Autowired/*它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。例GithubProvider githubProvider不需要再set方法
    和构造方法*/
    private GithubProvider githubProvider;/*创建GithubProvider类对象*/
    @GetMapping("/callback")
    public String callbcak(@RequestParam(name="code") String code,
                           @RequestParam(name="state") String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();/*创建AccessTokenDTO类对象*/
        //调用accessTokenDTO的方法
        accessTokenDTO.setClient_id("5b2932d4833eda58ec48");
        accessTokenDTO.setClient_secret("a68fa6b7abc6034e860d0b3c3cccdede65b85db2");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri("http://localhost:8888/callback");
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);/*accessTokenDTO这里有值,返回的是一串个人码 */
        GithubUser user = githubProvider.getUser(accessToken);/*user用来测试是否调用成功*/
        System.out.println(user.getName());
        System.out.println(user.getId());
        System.out.println(user.getBio());
        return "index";
    }
}
