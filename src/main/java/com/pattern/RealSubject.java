package com.pattern;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 20:02
 */
public class RealSubject implements Subject {
    @Override
    public String sayHello() {
        System.out.println("realSubject is called");
        return "hello";
    }
}
