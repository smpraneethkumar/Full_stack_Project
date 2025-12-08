package com.jfsproject.fullStatck;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        System.out.println(" Iam here.....");
        return  "Welcome to project";
    }
    @RequestMapping("/about")
    public String about(){
        return "this is about page";
    }
}
