package com.jack.appinfo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jack.appinfo.dto.AppCategoryDto;
import com.jack.appinfo.dto.DataDictionaryDto;
import com.jack.appinfo.pojo.AppInfo;
import com.jack.appinfo.pojo.DevUser;
import com.jack.appinfo.service.AppCategoryService;
import com.jack.appinfo.service.AppInfoService;
import com.jack.appinfo.service.DataDictionaryService;
import com.jack.appinfo.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/app")
public class DevAppController {
    @Autowired
    private AppInfoService appInfoService;
    @Autowired
    private DataDictionaryService dataDictionaryService;
    @Autowired
    private AppCategoryService appCategoryService;
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/index")
    public String index(@RequestParam(name = "pn", required = false, defaultValue = "1")Integer pageNum, HttpSession session, Model model) {
        //获取登录用户对象
        DevUser devUser = (DevUser)session.getAttribute("devUser");
        PageInfo<AppInfo> pageInfo = appInfoService.queryInfoByDevId(devUser.getId(),pageNum);


        //使用缓存
        if (!redisUtil.hasKey("flatformList")) {
            //查询所有的平台
            redisUtil.set("flatformList", dataDictionaryService.queryByTypeCode("APP_FLATFORM"));
        }
        List<DataDictionaryDto> flatformList = (List<DataDictionaryDto>) redisUtil.getValueByKey("flatformList");

        //查询所有App的状态
        if (!redisUtil.hasKey("statusList")) {
            redisUtil.set("statusList", dataDictionaryService.queryByTypeCode("APP_STATUS"));
        }
        List<DataDictionaryDto> statusList = (List<DataDictionaryDto>) redisUtil.getValueByKey("statusList");

        if (!redisUtil.hasKey("oneMenuList")) {
            redisUtil.set("oneMenuList", appCategoryService.getMenuByParentId(null));
        }
        //一级菜单
        List<AppCategoryDto> oneMenuList = (List<AppCategoryDto>) redisUtil.getValueByKey("oneMenuList");


        model.addAttribute("page", pageInfo);
        model.addAttribute("flatformList", flatformList);
        model.addAttribute("statusList", statusList);
        model.addAttribute("oneMenuList", oneMenuList);
        return "app/index";
    }
}
