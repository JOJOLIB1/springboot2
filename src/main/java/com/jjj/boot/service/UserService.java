package com.jjj.boot.service;

import com.jjj.boot.mapper.UserMapper;
import com.jjj.boot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: com.jjj.boot.service.UserService
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-07 12:15
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> queryAllUser() {
        return userMapper.selectAllUser();
    }

    public User queryOne() {
        return userMapper.selectById();
    }
}
