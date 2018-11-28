package com.baizhi.service.impl;

import com.baizhi.dao.MenuDao;
import com.baizhi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;

    @Override
    public Map getAll() {
        Map map=new HashMap();
        map.put("menulist",menuDao.getAll());

        return map;
    }
}
