package com.sha.springbootbookseller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Oauth2Controller {
    @GetMapping("/OAuth")
    public String entry(){
        return "Google ile başarılı bir şekilde giriş yaptınız";
    }
}
