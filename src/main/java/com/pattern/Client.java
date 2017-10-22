package com.pattern;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 20:05
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.sayHello();
    }
}
