package guru.springframework.spring5recipeapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        System.out.println("Something to say ...1111111111111");

        return "index";
    }
}
