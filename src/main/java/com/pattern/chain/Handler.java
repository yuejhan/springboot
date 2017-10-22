package com.pattern.chain;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 20:48
 */
public abstract class Handler {

    private Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void execute(){
        handlePorcess();
        if(successor != null){
            successor.execute();
        }
    }

    protected abstract void handlePorcess();
}
