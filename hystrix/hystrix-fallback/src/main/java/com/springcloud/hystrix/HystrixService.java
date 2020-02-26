package com.springcloud.hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "hystrix-client", fallback = Fallback.class)
//@FeignClient(name = "hystrix-client")
public interface HystrixService {

    @GetMapping("errors")
    public String fallback();
}
