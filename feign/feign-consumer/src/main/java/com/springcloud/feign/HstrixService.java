package com.springcloud.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * hystrix-client 是服务名。。。。
 */
@FeignClient("hystrix-client")
public interface HstrixService {


    /**
     * client :  hystrix-client client
     * @return
     */
    @GetMapping("/client")
    public String hystrix();


    /**
     * client :  hystrix-client fallback
     * @return
     */
    @GetMapping("/fallback")
    public String hellos();

}
