package com.mysite.sbb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/Hello")
    @ResponseBody
    public String hello() {return "Hello Spring Boot Board";}
}
