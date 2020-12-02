package com.oyc.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description:
 * @Author oyc
 * @Date 2020/12/2 12:23 上午
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;
}
