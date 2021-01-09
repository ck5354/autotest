package com.autotest.test;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * springboot启动入口
 *
 */
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
}
