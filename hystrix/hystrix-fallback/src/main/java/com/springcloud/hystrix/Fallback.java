package com.springcloud.hystrix;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Fallback implements HystrixService {
    //2. 声明一个Logger，这个是static的方式，我比较习惯这么写。
    private final static Logger logger = LoggerFactory.getLogger(Fallback.class);


    @Override
    @HystrixCommand(fallbackMethod = "fallback2")  // 多级降级
    public String fallback() {
        logger.info("我是 fallback啊");
//        return "我是 fallback啊";   // 一级降级
        throw new RuntimeException("我是 fallback啊");   // 一级降级
    }

    @HystrixCommand(fallbackMethod = "fallback3") // 多级降级
    public String fallback2() {
        logger.info("我是 fallback2222222222啊");
        throw new RuntimeException("我是 fallback2222222222啊");
    }

    public String fallback3() {
        logger.info("我是 fallback3333333333");
        return "我是 fallback3333333333";
    }
}
