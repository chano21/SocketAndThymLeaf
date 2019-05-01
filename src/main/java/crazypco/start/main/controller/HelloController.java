package crazypco.start.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import crazypco.start.main.crawl.FaceBookCrawl;
import crazypco.start.main.crawl.InstagramCrawl;

@Controller
public class HelloController {
  
	
	/*@Autowired
	DriverInfo driverinfo;
	*/
	@Autowired
	FaceBookCrawl facebook;
	
	@Autowired
	InstagramCrawl instagram;
	
	
	
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Greetings from ddzzzzzzzzzff Bootㅅtttdd!d";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String hello(Model model, @RequestParam(value = "test", defaultValue = "Unknown", required = false) String test) {

  
    	System.out.println(test);
    	 return "hello";
    }

    
    @RequestMapping("/viewTest")
    public String viewTest(Model model){
    	System.out.println("ㅎㅇㅎㅇdddsdafsadfadsfadsfads");
        model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "index";
    }
    
    @RequestMapping("/RestTest")
    public String RestTest(Model model) throws InterruptedException{
    	System.out.println("Hello thisis rest here");
        
    	facebook.TestDo();
    	//instagram.TestDo();
    	//System.out.println(driverinfo.getChromelocation());
    	//String result=RestServcie.Get("http://www.naver.com");
    	//System.out.println(result);
    //	model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "index";
    }
    
    
    
   
}