package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @GetMapping(value = "/")
    public String login(){
        return "login/login_index";
    }

    @RequestMapping(value = "/login_sumbit")
    public String sumbit(HttpServletRequest request){
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        if(name.equals("knight")){
            return "redirect:/list";
        }
        return "user/error";
    }
}
