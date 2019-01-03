package com.bj169.dao;

import com.bj169.model.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey ( Integer userId );

    int insert ( User record );

    User selectByPrimaryKey ( Integer userId );

    List<User> selectAll ();

    int updateByPrimaryKey ( User record );
}