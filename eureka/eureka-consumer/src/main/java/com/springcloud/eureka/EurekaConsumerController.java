package com.springcloud.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class EurekaConsumerController {

    @Autowired
    private LoadBalancerClient balancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String hello() {
        // 选择一个服务消费
        ServiceInstance serviceInstance = balancerClient.choose("eureka-client");
        if (serviceInstance == null) {
            return "No Available instance;";
        }
        // 服务地址
        String instanceAddr = String.format("http://%s:%s/client", serviceInstance.getHost(), serviceInstance.getPort());
        log.info("This is host is {} port is {}", serviceInstance.getHost(), serviceInstance.getPort());
        // 发起请求
        String response = restTemplate.getForObject(instanceAddr, String.class);
        return "Response is " + response;
    }

}
