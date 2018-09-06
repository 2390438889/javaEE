package com.lujie.jpa.dao.impl;

import com.lujie.jpa.base.dao.impl.JpaDaoImpl;
import com.lujie.jpa.dao.UserDao;
import com.lujie.jpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl extends JpaDaoImpl<User,Long> implements UserDao {

    public List<User> findAll(){
        return super.findAll();
    }

}
