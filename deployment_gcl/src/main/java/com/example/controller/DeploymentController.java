package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DeploymentController {

    @RequestMapping("helloAop")
    public Object getaa() {
        return "hellow world!";
    }


    @RequestMapping("helloError")
    public Object vvvv() {
        return 1 / 0;
    }

    /*** 测试页面跳转 ** @return */
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "xxxx");
        return "hello";
    }
}
