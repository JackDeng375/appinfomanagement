package com.jack.appinfo.service;

import com.jack.appinfo.dto.DataDictionaryDto;

import java.util.List;

public interface DataDictionaryService {

    /**
     * 根据typeCode返回字典数据
     */
    List<DataDictionaryDto> queryByTypeCode(String typeCode);
}
