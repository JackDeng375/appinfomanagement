package com.jack.appinfo.controller;

import com.jack.appinfo.dto.AppCategoryDto;
import com.jack.appinfo.pojo.AppCategory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/category")
public class AppCategoryController {


    //一级菜单级联
    @RequestMapping("/queryLevelByParentId/{parentId}")
    public List<AppCategoryDto> queryLevelByParentId(@PathVariable("parentId") Integer parentId) {

        System.out.println(parentId);

        return null;
    }
}
