package com.pattern.chain;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 20:50
 */
public class Client {

    static class HandlerA extends Handler{

        @Override
        protected void handlePorcess() {
            System.out.println("handler by a");
        }
    }

    static class HandlerB extends Handler{

        @Override
        protected void handlePorcess() {
            System.out.println("handler by b");
        }
    }

    static class HandlerC extends Handler{

        @Override
        protected void handlePorcess() {
            System.out.println("handler by C");
        }
    }

    public static void main(String[] args) {
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        HandlerC handlerC = new HandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        handlerA.execute();

    }
}
