package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("controllers")
public class MessageController {

    @GetMapping
    public String getString(){
        return "Yohoo";
    }


    @GetMapping(value = "dynamic-form")
    public String getDF(){
        return "dynamicForm";
    }

    @PostMapping(value = "dynamic-form")
    public String postDF(String request){
        System.out.println("sdgsgdfs");
        System.out.println(request);
        return request;
    }
}
