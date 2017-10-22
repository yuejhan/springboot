package com.pattern.chain;

import java.util.Arrays;
import java.util.List;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 21:32
 */
public class ChainClient {
    static class ChainHandleA extends ChainHandle{
        @Override
        protected void handleProcess() {
            System.out.println("handler by A");
        }
    }

    static class ChainHandleB extends ChainHandle{
        @Override
        protected void handleProcess() {
            System.out.println("handler by B");
        }
    }

    static class ChainHandleC extends ChainHandle{
        @Override
        protected void handleProcess() {
            System.out.println("handler by C");
        }
    }

    public static void main(String[] args) {
        List<ChainHandle> handlers = Arrays.asList(
                new ChainHandleA(),
                new ChainHandleB(),
                new ChainHandleC()
        );

        Chain chain = new Chain(handlers);
        chain.proceed();
    }
}
