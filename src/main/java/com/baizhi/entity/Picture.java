package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class Picture implements Serializable {
    private int id;
    private String title;
    private String imgPath;
    private String desc;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date date;

    public Picture() {
        super();
    }

    public Picture(String title, String imgPath, String desc) {
        this.title = title;
        this.imgPath = imgPath;
        this.desc = desc;
    }

    public Picture(int id, String title, String imgPath, String desc, String status) {
        this.id = id;
        this.title = title;
        this.imgPath = imgPath;
        this.desc = desc;
        this.status = status;
    }
}