package com.g7go.mybatis.service.impl;

import com.g7go.mybatis.bean.User;
import com.g7go.mybatis.bean.UserExample;
import com.g7go.mybatis.dao.UserMapper;
import com.g7go.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作用描述
 *
 * @Author: Mr_li
 * @CreateDate: 2018-12-04$ 13:55$
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findAll() {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(1);
        userMapper.countByExample(userExample);

        return userMapper.selectByPrimaryKey(1);
    }


}
