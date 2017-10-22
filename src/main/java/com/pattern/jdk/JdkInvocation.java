package com.pattern.jdk;

import com.pattern.RealSubject;
import com.pattern.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * 有点，如果接口类新添加了一个方法，动态代理的代理类就不需要修改的
 * @author cody
 * @version V1.0
 * @create 2017/10/22 19:54
 */
public class JdkInvocation implements InvocationHandler {

    private RealSubject realSubject;
    public JdkInvocation(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before");
        Object result = null;
        try{
            result = method.invoke(realSubject, args);
        }catch (Exception e){
            System.out.println("exception");
            throw e;
        }finally {
            System.out.println("after");
        }
        return result;
    }
}
