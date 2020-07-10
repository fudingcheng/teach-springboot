package com.itheima.configuration;


import com.itheima.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    //@ConditionalOnClass(name = {"redis.clients.jedis.Jedis"})
    @ConditionalOnProperty(name = "itcast",havingValue = "itheima")
    public User returnUser(){
        return new User();
    }

}
