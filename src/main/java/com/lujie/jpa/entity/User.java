package com.lujie.jpa.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="c_user")
@Component
public class User {
    //用户编号
    @Id
    @Column(name = "cu_id",columnDefinition = "BIGINT(20) comment '用户编号'")
    private Long uId;

    //用户名
    @Column(name = "cu_name",columnDefinition = "varchar(30) comment '用户姓名'",unique = true)
    private String uName;

    //密码
    @Column(name = "cu_pwd",columnDefinition = "varchar(30) comment '用户密码'")
    private String uPwd;

    //权限编号
    @Column(name = "cr_id",columnDefinition = "BIGINT(20) comment '用户权限编号'")
    private Long roleId;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
