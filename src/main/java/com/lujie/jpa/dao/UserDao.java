package com.lujie.jpa.dao;


import com.lujie.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    //获得所有的用户信息
    @Override
    List<User> findAll();

    //添加用户信息
    @Override
    User save(User user);

    //根据id删除用户信息
    @Override
    void deleteById(Long uId);

    //通过用户编号获得用户信息

    @Override
    Optional<User> findById(Long uId);
}
