package com.baizhi.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Menu implements Serializable {
    private int id;
    private String title;
    private String iconCls;
    private int parent_id;
    private String url;

}
