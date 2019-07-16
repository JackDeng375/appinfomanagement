package com.jack.appinfo.pojo;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "app_info")
public class AppInfo implements Serializable {
    @Id
    private Long id;

    @Column
    private String softwareName;
    @Column
    private String APKName;
    @Column
    private String supportROM;
    @Column
    private String interfaceLanguage;
    @Column
    private BigDecimal softwareSize;
    @Column
    private Date updateDate;
    @Column
    private Long devId;
    @Column
    private String appInfo;
    @Column
    private Long status;
    @Column
    private Date onSaleDate;
    @Column
    private Date offSaleDate;
    @Column
    private Long flatformId;
//    @Column
//    private Long categoryLevel1;
//    @Column
//    private Long categoryLevel2;
//    @Column
//    private Long categoryLevel3;

    @Transient
    private AppCategory categoryLevel1;
    @Transient
    private AppCategory categoryLevel2;
    @Transient
    private AppCategory categoryLevel3;

    @Column
    private Long downloads;
    @Column
    private Long createdBy;
    @Column
    private Date creationDate;
    @Column
    private Long modifyBy;
    @Column
    private Date modifyDate;
    @Column
    private String logoPicPath;
    @Column
    private String logoLocPath;
    @Column
    private Long versionId;
    @Transient
    private List<AppVersion> appVersions;
    @Transient
    private AppVersion newAppVersion;
    @Transient
    private DevUser devUser;
}