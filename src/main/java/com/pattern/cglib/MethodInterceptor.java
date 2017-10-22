package com.pattern.cglib;

import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 20:20
 */
public class MethodInterceptor implements org.springframework.cglib.proxy.MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result = null;
        try {
            result = methodProxy.invokeSuper(o,args);
        } catch (Exception e) {
            System.out.println("exception");
            throw e;
        }finally {
            System.out.println("after");
        }
        return result;
    }
}
