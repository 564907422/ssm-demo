package com.paas.demo.service.impl;

import com.paas.demo.dao.UserMapper;
import com.paas.demo.model.User;
import com.paas.demo.model.UserExample;
import com.paas.demo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectUsersByName(String name) {
        UserExample example = new UserExample();
        example.createCriteria().andNameLike("%" + name + "%");
        return userMapper.selectByExample(example);
    }

    @Override
    public int insert(User obj) {
        return userMapper.insert(obj);
    }
}
