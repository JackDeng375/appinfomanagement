package com.jack.appinfo.service.impl;

import com.google.common.collect.Lists;
import com.jack.appinfo.dto.DataDictionaryDto;
import com.jack.appinfo.mapper.DataDictionaryMapper;
import com.jack.appinfo.pojo.DataDictionary;
import com.jack.appinfo.service.DataDictionaryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
    @Autowired
    private DataDictionaryMapper dataDictionaryMapper;
    @Override
    public List<DataDictionaryDto> queryByTypeCode(String typeCode) {
        DataDictionary dataDictionary = DataDictionary.builder().typeCode(typeCode).build();
        List<DataDictionary> list = dataDictionaryMapper.select(dataDictionary);

        List<DataDictionaryDto> result = Lists.newArrayList();
        for (DataDictionary dictionary : list) {
            DataDictionaryDto dto = new DataDictionaryDto();
            BeanUtils.copyProperties(dictionary, dto);
            result.add(dto);
        }

        return result;
    }
}
