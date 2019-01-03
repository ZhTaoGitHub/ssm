package com.bj169.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController2{
    
    @RequestMapping("userList2.action")
    public String query(){
        return "index";
    }
}
