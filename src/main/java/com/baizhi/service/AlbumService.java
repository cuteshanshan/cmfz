package com.baizhi.service;

import com.baizhi.entity.Album;

import java.util.Map;

public interface AlbumService {
    public Map getAll(int page, int rows);
    public void add(Album album);
    public void delete(int id);
}
