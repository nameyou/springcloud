package com.springlcoud.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EurekaClientController {

    @Value("${server.port}")
    private String port;

    @GetMapping("client")
    public String hello() {
        return "This is Client 端口：" + port;
    }

}
