package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.service.LoginService;


public class LoginController {

    public static boolean login(User user){
        return  LoginService.login(user);
    }
}
