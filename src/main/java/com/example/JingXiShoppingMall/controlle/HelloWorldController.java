package com.example.JingXiShoppingMall.controlle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("")
public class HelloWorldController {
    @GetMapping("index")
    public String helloWorld() {
        System.out.println("HelloWorldController");
        return "/index";
    }
    @GetMapping("welcome")
    public String welcome() {
        System.out.println("welcome");
        return "/welcome";
    }
}
