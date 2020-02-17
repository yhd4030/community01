package life.haid.community.community01.controller;

import life.haid.community.community01.dto.PaginationDTO;
import life.haid.community.community01.dto.QuestionDTO;
import life.haid.community.community01.mapper.QuestionMapper;
import life.haid.community.community01.mapper.UserMapper;
import life.haid.community.community01.model.Question;
import life.haid.community.community01.model.User;
import life.haid.community.community01.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,//model是用于前端页面数据展示
                        @RequestParam(name="page",defaultValue = "1")Integer page ,
                        @RequestParam(name="size",defaultValue = "5")Integer size
    ) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0)
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (user != null) {
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }
        PaginationDTO pagination = questionService.list(page,size);//向DTO层传数据
        model.addAttribute("pagination",pagination);//向页面传输name为pagination的 pagination对象
        return "index";
    }

}
