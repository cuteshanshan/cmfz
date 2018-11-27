package com.baizhi.service.impl;

import com.baizhi.dao.ManagerDao;
import com.baizhi.entity.Manager;
import com.baizhi.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerDao managerDao;

    @Override
    public Manager login(String name, String password) {
        // TODO Auto-generated method stub
        return managerDao.login(name,password);
    }
}
