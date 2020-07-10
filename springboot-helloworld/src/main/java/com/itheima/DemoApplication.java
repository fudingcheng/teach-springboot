package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(value = {"cn.itheima"})      //第一种方式：使用ComponentScan扫描jar包中的package
//@Import(PersonConfig.class)                 //第二种方式：使用Import导入Config类
//@EnablePerson                               //第三种方式：使用自定义注解，封装@Import注解
public class DemoApplication {

    public static void main(String[] args) {

        //SpringApplication springApplication = new SpringApplication(DemoApplication.class);
        //springApplication.addInitializers(new MyApplicationContextInitializer());
        //springApplication.run(args);


        SpringApplication.run(DemoApplication.class, args);

        //Object person = context.getBean(Person.class);
        //System.out.println(person);

    }

}
