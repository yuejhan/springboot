package com.imooc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 18:54
 */
@Aspect
@Component
public class ObjectAspectConfig {

    /**
     * 匹配aop对象的目标对象为指定类型的方法，即DemoDao的aop代理对象的方法
     */
    @Pointcut("this(com.imooc.dao.DemoDao)")
    public void objectConfig() {

    }

    /**
     * 匹配实现了IDao接口的目标对象的方法
     */
    @Pointcut("target(com.imooc.dao.IDao)")
    public void targetConfig(){

    }


    /**
     * 匹配所有一dao结尾的bean里面的方法
     */
    @Pointcut("bean(*Dao)")
    public void beanConfig() {


    }
}
