package com.jason.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName BaseEntity
 * @Description Base Entity
 * @Author Jason Cao
 * @Date 2021/7/13 10:43 AM
 **/
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "ID")
    private long id;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_time")
    @CreatedDate
    private Date createdTime;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_time")
    @LastModifiedDate
    private Date updateTime;
}
