package com.itheima.condition;

import com.itheima.annotation.ConditionOnClass;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.List;

public class UserCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        boolean flag = true;

        //获得注解的属性集合
        MultiValueMap<String, Object> map = metadata.getAllAnnotationAttributes(ConditionOnClass.class.getName());
        //遍历注解属性——动态获取传入的属性值
        for (List<Object> values : map.values()) {
            for (Object value : values) {
                String[] strs = (String[])value;
                for (String str : strs) {
                    try {
                        //判断字节码是否存在
                        Class.forName(str); // com.alibaba.fastjson.JSON
                    } catch (ClassNotFoundException e) {
                        flag = false;
                        e.printStackTrace();
                    }
                }
            }
        }
        return flag;
    }
}
