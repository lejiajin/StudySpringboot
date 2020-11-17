package com.springboot;

import com.springboot.domain.User;
import com.springboot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringApplicationconfig.class)
public class MybatisTest {
    @Autowired
    UserMapper userMapper;
    @Test
    public void test(){
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println("user = " + user);
        }
    }
}
