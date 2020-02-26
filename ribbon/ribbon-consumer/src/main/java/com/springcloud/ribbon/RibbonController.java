package com.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 基于客户端的负载均衡模式：客户端拥有服务节点地址
 * 服务器端负载均衡模式：客户端需要经过 负载均衡器如：nginx等才能将请求分发到个服务器节点
 */
@RestController
public class RibbonController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("hello")
    public String hello() {
        return restTemplate.getForObject("http://eureka-client/client", String.class);
    }

}
