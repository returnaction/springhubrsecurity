package com.boot.controller;

import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    private final UserService userService;

    @Autowired
    public NewsController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/news")
    public String news(){
        return "news";
    }
}
