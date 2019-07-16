package com.jack.appinfo.service.impl;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jack.appinfo.dto.DataDictionaryDto;
import com.jack.appinfo.mapper.AppInfoMapper;
import com.jack.appinfo.mapper.DataDictionaryMapper;
import com.jack.appinfo.pojo.AppInfo;
import com.jack.appinfo.service.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppInfoServiceImpl implements AppInfoService {
    @Autowired
    private AppInfoMapper appInfoMapper;

    //TODO:分页失效
    @Override
    public PageInfo<AppInfo> queryInfoByDevId(Long id, Integer pageNum) {
        //设置分页参数
        PageHelper.startPage(pageNum, 5);
        //查询
        List<AppInfo> appInfos = appInfoMapper.queryAppByDevId(id);
        //封装分页数据
        PageInfo<AppInfo> pageInfo = new PageInfo<AppInfo>(appInfos);
        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(5);
        return pageInfo;
    }
}
