package com.baizhi.service.impl;

import com.baizhi.dao.PictureDao;
import com.baizhi.entity.Picture;
import com.baizhi.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    private PictureDao pictureDao;

    @Override
    public Map getAll(int page, int rows) {
        int start = (page - 1) * rows;
        int total = pictureDao.getCount();
        int pagesize = rows;
        List<Picture> list = pictureDao.getAll(start, pagesize);
        Map map = new HashMap();
        map.put("total", total);
        map.put("rows", list);
        return map;
    }

    @Override
    public Picture selectOne(int id) {
        return pictureDao.selectOne(id);
    }

    @Override
    public void update(Picture picture) {
        pictureDao.update(picture);
    }

    @Override
    public void delete(int id) {
        pictureDao.delete(id);
    }

    @Override
    public void add(Picture picture) {
        pictureDao.add(picture);
    }
}
