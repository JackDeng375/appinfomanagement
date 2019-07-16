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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "data_dictionary")
public class DataDictionary implements Serializable {
    @Id
    private Long id;

    @Column(name = "typeCode")
    private String typeCode;
    @Column(name = "typeName")
    private String typeName;
    @Column(name = "valueId")
    private Long valueId;
    @Column(name = "valueName")
    private String valueName;
    @Column(name = "createdBy")
    private Long createdBy;
    @Column(name = "creationDate")
    private Date creationDate;
    @Column(name = "modifyBy")
    private Long modifyBy;
    @Column(name = "modifyDate")
    private Date modifyDate;
}