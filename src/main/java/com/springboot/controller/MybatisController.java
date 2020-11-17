package com.springboot.controller;

import com.springboot.domain.User;
import com.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/find")
    public List<User> find(){
        List<User> users = userMapper.findAll();
        return users;
    }
}
