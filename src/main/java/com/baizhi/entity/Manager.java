package com.baizhi.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Manager implements Serializable{
    private int id;
    private String name;
    private String password;

}
