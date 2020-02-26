package com.springcloud.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * eureka-client 是服务名。。。。
 */
@FeignClient("eureka-client")
public interface FeignService {

    /**
     * client :  是eureka-client 服务下的hello方法
     * @return
     */
    @GetMapping("/client")
    public String hellos();

}
