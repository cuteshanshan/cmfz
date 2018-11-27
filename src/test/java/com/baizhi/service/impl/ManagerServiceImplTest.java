package com.baizhi.service.impl;

import com.baizhi.entity.Manager;
import com.baizhi.service.ManagerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerServiceImplTest {
    @Autowired
    private ManagerService managerService;

    @Test
    public void login() {
        Manager manager = managerService.login("shanshan", "123456");
        System.out.println(manager);
    }

}