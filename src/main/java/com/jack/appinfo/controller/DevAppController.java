package com.jack.appinfo.controller;

import com.jack.appinfo.pojo.DevUser;
import com.jack.appinfo.service.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/app")
public class DevAppController {
    @Autowired
    private AppInfoService appInfoService;

    @RequestMapping("/index")
    public String index(HttpSession session) {
        DevUser devUser = (DevUser)session.getAttribute("devUser");
        System.out.println(devUser.getDevName());
        return "app/index";
    }
}
