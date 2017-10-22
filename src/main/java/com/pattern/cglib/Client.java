package com.pattern.cglib;

import com.pattern.RealSubject;
import com.pattern.Subject;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 20:25
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new MethodInterceptor());
        Subject subject  = (Subject) enhancer.create();
        subject.sayHello();

    }
}
