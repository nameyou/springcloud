package com.springcloud.hystrix;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.RoleUnresolved;


@RestController
public class HystrixController {

    @Value("${server.port}")
    private String port;

    /**
     * feign-consumer 消费者的提供者
     * @return
     */
    @GetMapping("client")
    public String hystrix() {
//        return " 我是 hystrix 提供者，我的端口是：" + port;
        System.out.println(" 我是 hystrix 提供者，我的端口是：" + port);
        throw new RuntimeException("降级了了");
    }


}
