package com.jack.appinfo.mapper;

import com.jack.appinfo.pojo.AppInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AppInfoMapper extends Mapper<AppInfo> {
    List<AppInfo> queryAppByDevId(@Param("devId") Long devId);
}