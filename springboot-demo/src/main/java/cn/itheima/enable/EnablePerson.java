package cn.itheima.enable;

import cn.itheima.config.PersonConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Import(PersonConfig.class)
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnablePerson {
}
