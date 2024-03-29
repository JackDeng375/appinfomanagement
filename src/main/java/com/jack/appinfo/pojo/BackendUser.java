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
@Table(name = "backend_user")
public class BackendUser  implements Serializable {

    @Id
    private Long id;

    @Column
    private String userCode;
    @Column
    private String userName;
    @Column
    private Long userType;
    @Column
    private Long createdBy;
    @Column
    private Date creationDate;
    @Column
    private Long modifyBy;
    @Column
    private Date modifyDate;
    @Column
    private String userPassword;


}