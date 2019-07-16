package com.jack.appinfo.dto;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AppCategoryDto {
    private Long id;
    private String categoryCode;
    private String categoryName;
    private Long parentId;
}
