package com.pattern.chain;

import java.util.List;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 21:26
 */
public class Chain {

    private List<ChainHandle> handlers;

    private int index = 0;

    public Chain(List<ChainHandle> handlers) {
        this.handlers = handlers;
    }

    public void proceed(){
        if(index >= handlers.size()){
            return;
        }
        handlers.get(index++).execute(this);
    }
}
