package crazypco.start.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
   
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Greetings from ddddddddzzzzzzzzzff Bootㅅtttdd!";
    }

    @RequestMapping("/viewTest")
    public String viewTest(Model model){
    	System.out.println("ㅎㅇㅎㅇdddd");
        model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "index";
    }
   
}