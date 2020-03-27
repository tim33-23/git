package com.example.springwebcontent.controller;


import com.example.springwebcontent.exceptions.UserNotFoundException;
import com.example.springwebcontent.model.Name;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/testMethod")
    @ResponseBody
    public Name print(){
        throw new UserNotFoundException();
    }
}
