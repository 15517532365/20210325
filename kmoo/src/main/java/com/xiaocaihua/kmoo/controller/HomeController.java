package com.xiaocaihua.kmoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/test")
    public String test() {
        return "/TestHome";
    }


}
