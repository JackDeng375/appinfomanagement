package com.jack.appinfo.controller;

import com.jack.appinfo.pojo.DevUser;
import com.jack.appinfo.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller()
@RequestMapping("/dev")
public class DevUserController {

    @Autowired
    private DevUserService devUserService;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "dev/login";
    }

    @RequestMapping("/loginout")
    public String loginout(HttpSession session) {
        session.removeAttribute("devUser");
        //session失效
        session.invalidate();
        return "index";
    }


    @RequestMapping("/login")
    public String login(DevUser devUser, Model model, HttpSession session) {
        devUser = devUserService.login(devUser);
        if (devUser != null) {
            //将登录对象保存到session中
            session.setAttribute("devUser", devUser);
            return "dev/index";
        }
        model.addAttribute("errMsg", "登录失败");
        return "dev/login";
    }
}