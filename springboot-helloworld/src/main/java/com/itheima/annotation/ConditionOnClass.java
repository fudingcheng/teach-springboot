package com.itheima.annotation;

import com.itheima.condition.UserCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(UserCondition.class)
public @interface ConditionOnClass {

    String[] value();

}
