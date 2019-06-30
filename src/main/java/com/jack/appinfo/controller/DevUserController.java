package com.jack.appinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/dev")
public class DevUserController {
    @RequestMapping("/index")
    public String index() {
        return "dev/index";
    }
}