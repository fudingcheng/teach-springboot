package com.itheima;

import com.itheima.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testAdd(){
        userService.add();
    }

}
