package com.lujie.jpa.dao;

import com.lujie.jpa.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserDao{
    //获得所有的用户信息
    public List<User> findAll();
}
