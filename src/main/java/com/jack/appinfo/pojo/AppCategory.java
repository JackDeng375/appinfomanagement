package com.jack.appinfo.pojo;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "app_category")
public class AppCategory  implements Serializable {
    @Id
    private Long id;
    @Column(name = "categoryCode")
    private String categoryCode;
    @Column(name = "categoryName")
    private String categoryName;
    @Column(name = "parentId")
    private Long parentId;
    @Column(name = "createdBy")
    private Long createdBy;
    @Column(name = "creationTime")
    private Date creationTime;
    @Column(name = "modifyBy")
    private Long modifyBy;
    @Column(name = "modifyDate")
    private Date modifyDate;
    @Transient
    private List<Appinfo> appinfos;
}