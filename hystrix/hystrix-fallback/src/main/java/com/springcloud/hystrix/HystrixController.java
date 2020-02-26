package com.springcloud.hystrix;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@Slf4j
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping("fallback")
    public String hystrix() {
        String fallback = hystrixService.fallback();
        System.out.println("到了，降级流程了。。。。。");
        return fallback;
    }

}
