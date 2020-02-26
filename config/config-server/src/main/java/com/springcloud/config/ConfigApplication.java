package com.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {


    /**
     * 两种获取的方式
     *  http://localhost:8000/{label}/{application}-{profile}.yml (.properties/.json)
     *  http://localhost:8000/{application}/{profile}/{label}
     * @param args
     */


    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}