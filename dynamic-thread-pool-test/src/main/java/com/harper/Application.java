package com.harper;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName：Application
 * @Author: Administrator
 * @Date: 2024/9/3 23:12
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
@SpringBootApplication
@Configurable
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
