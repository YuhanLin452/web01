package com.qf.service.impl;

import com.qf.dao.UserMapper;
import com.qf.domain.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required=false)
    private UserMapper userMapper;
    @Override
    public List<User> findUser() {
        return userMapper.findList();
    }
}
