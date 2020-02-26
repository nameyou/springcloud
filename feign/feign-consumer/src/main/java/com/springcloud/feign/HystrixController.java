package com.springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {


    /**
     * 注入hystrix的接口
     */
    @Autowired
    private HstrixService hstrixService;

    @GetMapping("/hystrix")
    public String hystrix() {
        return hstrixService.hystrix();
    }


}
