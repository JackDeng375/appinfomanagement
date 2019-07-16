package com.jack.appinfo.service;

import com.github.pagehelper.PageInfo;
import com.jack.appinfo.dto.DataDictionaryDto;
import com.jack.appinfo.pojo.AppInfo;

import java.util.List;

public interface AppInfoService {
    /**
     * 查询当前用户发布的app
     * @param id 当前用户id
     * @return 发布的app
     */
    PageInfo<AppInfo> queryInfoByDevId(Long id, Integer pageNum);
}
