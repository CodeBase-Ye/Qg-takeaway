package com.studyLab.autFru.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.studyLab.autFru.entity.User;
import com.studyLab.autFru.mapper.UserMapper;
import com.studyLab.autFru.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
