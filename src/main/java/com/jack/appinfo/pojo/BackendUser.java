package com.jack.appinfo.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@Setter
@Builder
public class BackendUser {
    private Long id;

    private String userCode;

    private String userName;

    private Long userType;

    private Long createdBy;

    private Date creationDate;

    private Long modifyBy;

    private Date modifyDate;

    private String userPassword;


}