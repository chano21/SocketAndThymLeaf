package crazypco.start.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import crazypco.start.resetservice.RestServcie;

@Controller
public class HelloController {
   
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Greetings from ddddddddddddzzzzzzzzzff Bootㅅtttdd!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String hello(Model model, @RequestParam(value = "test", defaultValue = "Unknown", required = false) String test) {

    	System.out.println(test);
    	 return "hello";
    }

    
    @RequestMapping("/viewTest")
    public String viewTest(Model model){
    	System.out.println("ㅎㅇㅎㅇdddd");
        model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "index";
    }
    
    @RequestMapping("/RestTest")
    public String RestTest(Model model){
    	System.out.println("Hello thisis rest here");
        
    	String result=RestServcie.Get("http://www.naver.com");
    	System.out.println(result);
    //	model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "index";
    }
    
    
    
   
}