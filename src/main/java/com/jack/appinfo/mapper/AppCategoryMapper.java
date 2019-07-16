package com.jack.appinfo.mapper;

import com.jack.appinfo.dto.AppCategoryDto;
import com.jack.appinfo.pojo.AppCategory;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AppCategoryMapper extends Mapper<AppCategory> {
    List<AppCategory> getMenuByParentId(@Param("parentId") Integer parentId);
}