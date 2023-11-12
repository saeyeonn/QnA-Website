package com.example.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/board")
    @ResponseBody
    public String index() {
        return "Welcome to Q&A Board";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
