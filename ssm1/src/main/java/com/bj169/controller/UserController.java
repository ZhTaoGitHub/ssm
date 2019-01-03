package com.bj169.controller;

import com.bj169.pojo.User;
import org.springframework.web.servlet.mvc.Controller;

import java.util.List;

public interface UserController extends Controller{
    
    List<User> findAll();
}
