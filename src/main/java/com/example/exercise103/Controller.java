package com.example.exercise103;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String homePage(){
        return "hometemplate";
    }
}
