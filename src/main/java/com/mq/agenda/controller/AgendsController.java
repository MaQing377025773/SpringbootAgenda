package com.mq.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgendsController {
    //首页板块
    @GetMapping("/index_contact")
    public String index_contact(){
        return "html/index_contact";
    }
    //日程分类板块
    @GetMapping("/create_agen_class")
    public String create_agen_class(){
        return "html/create_agen_class";
    }
    @GetMapping("/stration_agen_class")
    public String stration_agen_class(){
        return "html/stration_agen_class";
    }
    //日程板块
    @GetMapping("/create_agen")
    public String create_agen(){
        return "html/create_agen";
    }
    @GetMapping("/stration_agen")
    public String stration_agen(){
        return "html/stration_agen";
    }
    //社交板块
    @GetMapping("/create_dynamic")
    public String create_dynamic(){
        return "html/create_dynamic";
    }
    @GetMapping("/stration_dynamic")
    public String stration_dynamic(){
        return "html/stration_dynamic";
    }
    //个人资料
    @GetMapping("/revise_information")
    public String revise_information(){
        return "html/revise_information";
    }


}
