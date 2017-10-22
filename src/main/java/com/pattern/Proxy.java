package com.pattern;

import com.imooc.handler.ExceptionHandler;

/**
 *
 * 缺点就是，当接口类添加类添加类新方法的时候，不仅实现类要实现新方法，代理类也要实现新方法。
 * @author cody
 * @version V1.0
 * @create 2017/10/22 20:02
 */
public class Proxy implements Subject{

    private RealSubject realSubject;
    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public String sayHello() {
        System.out.println("berfore");
        String result = null;
        try{
            result = realSubject.sayHello();
        }catch (Exception e){
            System.out.println("exception");
            throw e;
        }finally {
            System.out.println("after");
        }
        return result;
    }
}
