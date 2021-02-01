package com.autotest.test;

import com.autotest.test.service.MyFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.Filter;

/**
 * springboot启动入口
 *
 */

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan(basePackages  = "com.autotest.test.dao")
@SpringBootApplication

public class Application implements ApplicationContextAware
{
    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(com.autotest.test.Application.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /*@Bean
    Filter filter() {
        MyFilter myFilter = new MyFilter();
        return myFilter;
    }*/
}
