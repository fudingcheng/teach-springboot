package com.itheima;


import com.itheima.dao.UserRepository;
import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMybatis {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void testListUser(){
        List<User> users = userRepository.listUser();
        System.out.println(users);
    }
}
