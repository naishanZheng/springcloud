package com.springboot.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhengnaishan
 * @date 2019/8/6 0006
 * @describe :
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class DeptProvider8001_App {
    public static void main(String[] args)
    {
        SpringApplication.run(DeptProvider8001_App.class, args);
    }
}