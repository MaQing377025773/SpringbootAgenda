package com.mq.agenda.controller;

import com.mq.agenda.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @GetMapping(value ={"/"})
    public String loginpage(){
        return "login";
    }
    @PostMapping("/login")
    public String index(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getEmail()) && "123456".equals(user.getPassword())){
            //把登录成功的用户保存起来
            session.setAttribute("loginEmail",user);
            //登录成功重定向
            return "redirect:/index.html";
        }else{
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }

   @GetMapping("/index.html")
    public String indexPage(HttpSession session,Model model){
        Object loginUser = session.getAttribute("loginEmail");
        if(loginUser != null){
            return "index";
        }else{
            model.addAttribute("msg","请重新登录!");
            return "login";
        }
   }

}
