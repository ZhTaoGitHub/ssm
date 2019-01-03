package com.bj169.controller.impl;

import com.bj169.controller.UserController;
import com.bj169.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserControllerImpl implements UserController{
    @Override
    public List<User> findAll (){
        
        List<User> userList=new ArrayList <> ();
        User user=new User ();
        user.setUserId (1);
        user.setUserName ("张三丰");
        User user2=new User ();
        user2.setUserId (2);
        user2.setUserName ("周芷若");
        userList.add (user);
        userList.add (user2);
        return userList;
    }
    
    @Override
    @RequestMapping("userList.action")
    public ModelAndView handleRequest ( HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse ) throws Exception{
    
        ModelAndView modelAndView=new ModelAndView ();
        modelAndView.addObject ("userList",findAll ());
        modelAndView.setViewName ("index");
        return modelAndView;
    }
}
