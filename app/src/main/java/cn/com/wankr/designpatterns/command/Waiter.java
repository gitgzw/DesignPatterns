package cn.com.wankr.designpatterns.command;

/**
 * Created by lei on 2016/9/30.
 */

public class Waiter {

    private Command pig;
    private Command duck;

    public void setCommandPig(Command pig) {
        this.pig = pig;
    }
    public void setCommandDuck(Command duck) {
        this.duck = duck;
    }

    /**
     * 执行正常命令，这里省略了undo和redo操作
     */
    public void invoke(int args) {
        //可以根据具体情况选择执行某些命令
        if(args == 0){
            pig.execute();
        }else if(args == 1){
            duck.execute();
        }
    }
}
