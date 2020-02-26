package com.springcloud.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 拉取github配置
 */
@RestController
public class ConfigClientController {
    private final static Logger logger = LoggerFactory.getLogger(ConfigClientController.class);

    @Value("${name}")
    private String name;


    @Value("${mywords}")
    private String mywords;

    /**
     * 通过 config-server直接读取github配置属性
     * @return
     */
    @GetMapping("name")
    public String getName() {
        return name;
    }

    /**
     * 通过配置读取本地配置文件属性（本地属性通过读取github属性获取）
     * @return
     */
    @GetMapping("mywords")
    public String getwords() {
        return mywords;
    }
}
