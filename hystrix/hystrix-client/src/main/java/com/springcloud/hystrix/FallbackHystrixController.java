package com.springcloud.hystrix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 降级逻辑处理
 */
@RestController
public class FallbackHystrixController {

    @GetMapping("errors")
    public String fallback() {
        System.out.println("降级逻辑。。。。");
        throw new RuntimeException("降级逻辑。。。。");
    }

}
