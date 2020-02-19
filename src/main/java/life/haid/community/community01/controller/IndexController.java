package life.haid.community.community01.controller;

import life.haid.community.community01.dto.PaginationDTO;
import life.haid.community.community01.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {


    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(
                        Model model,//model是用于前端页面数据展示
                        @RequestParam(name="page",defaultValue = "1")Integer page ,
                        @RequestParam(name="size",defaultValue = "5")Integer size
    ) {

        PaginationDTO pagination = questionService.list(page,size);//向DTO层传数据
        model.addAttribute("pagination",pagination);//向页面传输name为pagination的 pagination对象
        return "index";
    }

}
