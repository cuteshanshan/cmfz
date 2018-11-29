package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Album implements Serializable {
    private int id;
    private String title;
    private String coverImg;//封面图片
    private int count;//集数
    private int score;//评分
    private String author;
    private String broadCast;//播音员
    private String brief;//简介
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date publishDate;//发布日期
    private List<Chapter> children;

    public Album() {
        super();
    }

    public Album(String title, String coverImg, int count, int score, String author, String broadCast, String brief) {
        this.title = title;
        this.coverImg = coverImg;
        this.count = count;
        this.score = score;
        this.author = author;
        this.broadCast = broadCast;
        this.brief = brief;
    }

    public Album(int id, String title, String coverImg, int count, int score, String author, String broadCast, String brief, Date publishDate) {
        this.id = id;
        this.title = title;
        this.coverImg = coverImg;
        this.count = count;
        this.score = score;
        this.author = author;
        this.broadCast = broadCast;
        this.brief = brief;
        this.publishDate = publishDate;
    }

    public Album(int id, String title, String coverImg, int count, int score, String author, String broadCast, String brief, Date publishDate, List<Chapter> children) {
        this.id = id;
        this.title = title;
        this.coverImg = coverImg;
        this.count = count;
        this.score = score;
        this.author = author;
        this.broadCast = broadCast;
        this.brief = brief;
        this.publishDate = publishDate;
        this.children = children;
    }
}
