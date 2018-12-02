package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


@Data
public class User implements Serializable {
    private int id;
    private String phoneNum;
    private String username;
    private String password;
    private String salt;
    private String dharmaName;
    private String province;
    private String city;
    private String sex;
    private String sign;
    private String headPic;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date date;

    public User() {
        super();
    }

    public User(String phoneNum, String username, String password, String dharmaName, String province, String city, String sex, String sign, String headPic) {
        this.phoneNum = phoneNum;
        this.username = username;
        this.password = password;
        this.dharmaName = dharmaName;
        this.province = province;
        this.city = city;
        this.sex = sex;
        this.sign = sign;
        this.headPic = headPic;
    }

    public User(int id, String phoneNum, String username, String password, String salt, String dharmaName, String province, String city, String sex, String sign, String headPic, String status, Date date) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.dharmaName = dharmaName;
        this.province = province;
        this.city = city;
        this.sex = sex;
        this.sign = sign;
        this.headPic = headPic;
        this.status = status;
        this.date = date;
    }
}
