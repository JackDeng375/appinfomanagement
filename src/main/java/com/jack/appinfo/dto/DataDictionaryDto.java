package com.jack.appinfo.dto;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DataDictionaryDto {
    private Long id;
    private String typeCode;
    private String typeName;
    private Long valueId;
    private String valueName;

}
