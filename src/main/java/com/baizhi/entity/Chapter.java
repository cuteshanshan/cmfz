package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class Chapter implements Serializable {
    private String id;
    private String title;
    private String size;//章节音频大小
    private String duration;//章节音频时长
    private String downPath;//下载地址
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date uploadDate;//上传日期
    private int album_id;//所属专辑id

    public Chapter() {
        super();
    }

    public Chapter(String title, String size, String duration, String downPath, int album_id) {
        this.title = title;
        this.size = size;
        this.duration = duration;
        this.downPath = downPath;
        this.album_id = album_id;
    }

    public Chapter(String id, String title, String size, String duration, String downPath, Date uploadDate, int album_id) {
        this.id = id;
        this.title = title;
        this.size = size;
        this.duration = duration;
        this.downPath = downPath;
        this.uploadDate = uploadDate;
        this.album_id = album_id;
    }
}
