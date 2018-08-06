package com.example.demo;


import com.example.demo.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/")
    public String index(){
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<User> users=userService.getList();
        model.addAttribute("users",users);
        return "user/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id){
        User user=userService.findById(id);
        model.addAttribute("user",user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(User user){
        try {
            userService.edit(user);
            return "redirect:/list";
        }catch(Exception ex){
            return "user/error";
        }
    }

    @RequestMapping("/delete")
    public String delete(Long id){
        userService.delete(id);
        return "redirect:/list";
    }

}
