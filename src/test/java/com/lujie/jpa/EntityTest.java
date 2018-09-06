package com.lujie.jpa;

import com.lujie.jpa.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntityTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void userTest(){
        System.out.println(userDao.findAll());
    }
}
