package com.example.springwebcontent.controller;

import com.example.springwebcontent.repository.entity.User;
import com.example.springwebcontent.service.PasswordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {

    @GetMapping("/registration")
    public String getRegisterPage() {
        return "registration";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/main")
    public String getMainPage(Model model){
        model.addAttribute("login","Vasya");
        return "main";
    }

}
