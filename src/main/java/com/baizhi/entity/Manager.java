package com.baizhi.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Manager implements Serializable{
    private int id;
    private String name;
    private String password;

    public Manager() {
        super();
    }

    public Manager(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
