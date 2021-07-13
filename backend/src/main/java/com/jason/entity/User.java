package com.jason.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName User
 * @Description User
 * @Author Jason Cao
 * @Date 2021/7/13 11:14 AM
 **/
@Getter
@Setter
@Entity
@Table(name = "user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User extends BaseEntity{
    private String name;
}
