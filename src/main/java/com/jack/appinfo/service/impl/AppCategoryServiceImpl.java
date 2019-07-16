package com.jack.appinfo.service.impl;

import com.google.common.collect.Lists;
import com.jack.appinfo.dto.AppCategoryDto;
import com.jack.appinfo.mapper.AppCategoryMapper;
import com.jack.appinfo.pojo.AppCategory;
import com.jack.appinfo.service.AppCategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppCategoryServiceImpl implements AppCategoryService {
    @Autowired
    private AppCategoryMapper appCategoryMapper;

    /**
     * 获取菜单分类
     * @param parentId 父类的分类ID
     */
    @Override
    public List<AppCategoryDto> getMenuByParentId(Integer parentId) {
        List<AppCategoryDto> dto = Lists.newArrayList();

        for (AppCategory item : appCategoryMapper.getMenuByParentId(parentId)) {
            AppCategoryDto d = new AppCategoryDto();
            BeanUtils.copyProperties(item,d);
            dto.add(d);
        }
        return dto;
    }

}
