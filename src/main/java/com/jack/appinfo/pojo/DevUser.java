package com.jack.appinfo.pojo;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "dev_user")
public class DevUser implements Serializable {
    @Id
    private Long id;

    @Column
    private String devCode;
    @Column
    private String devName;
    @Column
    private String devPassword;
    @Column
    private String devEmail;
    @Column
    private String devInfo;
    @Column
    private Long createdBy;
    @Column
    private Date creationDate;
    @Column
    private Long modifyBy;
    @Column
    private Date modifyDate;


}