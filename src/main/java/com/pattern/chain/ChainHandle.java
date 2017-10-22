package com.pattern.chain;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 21:27
 */
public abstract class ChainHandle {


    public void execute(Chain chain){
        handleProcess();
        chain.proceed();
    }

    protected abstract void handleProcess();
}
