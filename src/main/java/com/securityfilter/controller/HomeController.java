package com.securityfilter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home () {
            return "/home";
    }



    @PostMapping(value = "/login")
    public String loginPost () {
        return "redirect:/";
    }



    @GetMapping(value = "/user")
    public String user () {
        return "/user";
    }


}
