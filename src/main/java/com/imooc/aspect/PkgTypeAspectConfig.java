package com.imooc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 18:47
 */

@Aspect
@Component
public class PkgTypeAspectConfig {


    /**
     * 匹配ProductService中的所有方法
     */
    @Pointcut("within(com.imooc.service.ProductService)")
    public void pkgType(){

    }


    /**
     * 匹配imooc包及其子包中的所有类的方法
     */
    @Pointcut("within(com.imooc..*)")
    public  void subType(){

    }
}
