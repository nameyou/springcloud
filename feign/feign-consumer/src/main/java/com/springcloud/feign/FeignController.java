package com.springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {


    /**
     * 注入feign的接口
     */
    @Autowired
    private FeignService feignService;

    @GetMapping("/feign")
    public String feign() {
        return feignService.hellos();
    }







}
