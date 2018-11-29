package com.baizhi.service.impl;

import com.baizhi.dao.AlbumDao;
import com.baizhi.entity.Album;
import com.baizhi.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumDao albumDao;
    @Override
    public Map getAll(int page, int rows) {
        int start = (page - 1) * rows;
        int total = albumDao.getCount();
        int pagesize = rows;

        Map map=new HashMap();
        List<Album> list=albumDao.getAll(start,pagesize);
        map.put("total", total);
        map.put("rows", list);
        return map;
    }

    @Override
    public void add(Album album) {
        albumDao.add(album);
    }

    @Override
    public void delete(int id) {

    }


}
