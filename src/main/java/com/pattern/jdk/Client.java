package com.pattern.jdk;

import com.pattern.RealSubject;
import com.pattern.Subject;

import java.lang.reflect.Proxy;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 20:12
 */
public class Client {
    public static void main(String[] args) {
        //配置系统属性，可以静动态代理生成的类保存到本地
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{Subject.class},new JdkInvocation(new RealSubject()));
        subject.sayHello();
    }
}
