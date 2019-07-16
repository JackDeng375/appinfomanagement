package com.jack.appinfo.service;

import com.jack.appinfo.dto.AppCategoryDto;

import java.util.List;

public interface AppCategoryService {
    List<AppCategoryDto> getMenuByParentId(Integer parentId);
}
