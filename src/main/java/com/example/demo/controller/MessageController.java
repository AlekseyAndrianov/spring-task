package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTML;

@Controller
@RequestMapping("controllers")
public class MessageController {

    @GetMapping
    public String getString(){
        return "Yohoo";
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String getHello(){
        return "hello";
    }
}
