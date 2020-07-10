package cn.itheima.config;

import cn.itheima.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    public Person person(){
        return new Person();
    }

}
