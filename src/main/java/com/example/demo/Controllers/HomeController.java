package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Index(){
        return "index";
    }

    @GetMapping("/Stories")
    public String Lisatdo(){
        return "Online/Stories/index";
    }

    @GetMapping("/Gallery")
    public String Saludo(){
        return "Online/Gallery/index";
    }
    
}
