package com.imooc.controller;

import com.imooc.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 14:22
 */
@RestController
public class HellWorldController {

    @Value("${application.version}")
    private String appVersion;
    @Value("${application.author}")
    private String appAuthor;

    @Autowired
    private ApplicationProperties applicationProperties;

    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String sayHello(){
        return "hello spring boot"+appAuthor +"  "+ appVersion + applicationProperties;
    }
}
