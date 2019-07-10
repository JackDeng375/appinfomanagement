package com.jack.appinfo.mapper;

import com.jack.appinfo.pojo.DevUser;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DevUserMapper extends Mapper<DevUser> {
    List<DevUser> queryByNamePwd(DevUser devUser);
}