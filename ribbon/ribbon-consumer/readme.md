### 负载均衡策略配置
1. 全局配置
2. 基于服务的负载均衡策略
    1. 基于注解的基于服务的负载均衡策略：
       name: 服务的名字
       configuretion ：负载均衡策略
    2. 基于配置文件：
      eureka-client.ribbon.NFLoadBalancerRuleClassName=com.netflix.loadbalancer.RandomRule
        注解会覆盖配置文件的负载均衡策略


### 7种负载均衡策略
    RoundRobinRule ：轮训
    RandomRule : 随机
    BestAvailableRule : 连接数最少
    RetryRule : 重试
    

### 自旋锁
  for (;;) {


### 防御性编程
    多判断null之情况
    
