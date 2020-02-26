package com.springcloud.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 两种基于服务的负载均衡策略
 *
 * 1. 基于注解的基于服务的负载均衡策略：
 *      name: 服务的名字
 *      configuretion ：负载均衡策略
 * 2.  基于配置文件：
 *      eureka-client.ribbon.NFLoadBalancerRuleClassName=com.netflix.loadbalancer.RandomRule
 *      注解会覆盖配置文件的负载均衡策略
 *
 * 全局的负载均衡策略
 *
 */


@Configuration
//@RibbonClient(name = "eureka-client", configuration = com.netflix.loadbalancer.RoundRobinRule.class)
// 自定负载均衡策略
//@RibbonClient(name = "eureka-client", configuration = com.springcloud.ribbon.CustomerRibbonRule.class)
public class RibbonConfig {


    /**
     * 第一种方式：
     * @RibbonClient(name = "eureka-client", configuration = com.springcloud.ribbon.CustomerRibbonRule.class)
     * 第二种：负载均衡策略配置方式
     * @return
     */
    @Bean
    public IRule CustomerRule() {
        return new CustomerRibbonRule();
    }


    /**
     * @return
     * @LoadBalanced 负载均衡的注解
     */

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    /**
     * 全局负载均衡策略
     *
     * @return
     */
//    @Bean
//    public IRule rule() {
//        return new RandomRule();
//    }

}
