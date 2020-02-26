package com.springcloud.feign;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 源码分析  @EnableFeignClients注解   和 FeignContext应用上下文(从FeignClientFactoryBean的247行开始，)
 * @Override
 *    public void registerBeanDefinitions(AnnotationMetadata metadata,
 * 			BeanDefinitionRegistry registry) {
 * 		    registerDefaultConfiguration(metadata, registry);
 * 		    registerFeignClients(metadata, registry);
 *    }
 */
@SpringBootApplication
@EnableFeignClients
public class FeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class, args);
    }
}
