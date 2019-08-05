package com.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @author zhengnaishan
 * @date 2019/7/21 0021
 * @describe :
 */
@SpringBootApplication
@EnableConfigServer
public class StartApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(StartApplication.class, args);
    }
}
