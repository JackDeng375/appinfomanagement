package com.jack.appinfo.pojo;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "app_version")
public class AppVersion implements Serializable {
    @Id
    private Long id;

    @Column
    private Long appId;
    @Column
    private String versionNo;
    @Column
    private String versionInfo;
    @Column
    private Long publishStatus;
    @Column
    private String downloadLink;
    @Column
    private BigDecimal versionSize;
    @Column
    private Long createdBy;
    @Column
    private Date creationDate;
    @Column
    private Long modifyBy;
    @Column
    private Date modifyDate;
    @Column
    private String apkLocPath;
    @Column
    private String apkFileName;

    @Transient
    private AppInfo appInfo;
}