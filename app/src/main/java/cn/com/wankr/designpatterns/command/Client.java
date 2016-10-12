package cn.com.wankr.designpatterns.command;

/**
 * Created by lei on 2016/9/30.
 */

public class Client {
    /**
     * 组装操作
     */
    public void assembleAction() {

        //创建一个命令接收者
        Cook mCook = new Cook();

        //创建一个命令的具体实现对象，并指定命令接收者
        Command pig = new PigCook(mCook);
        Command duck = new DuckCook(mCook);

        Waiter mWaiter = new Waiter();//创建一个命令调用者
        //为调用者指定烤乳豬命令对象
        mWaiter.setCommandPig(pig);
        //为调用者指定烧花鸭命令对象
        mWaiter.setCommandDuck(duck);

        //发起调用烤乳猪命令请求
        mWaiter.invoke(0);
        //发起调用烧花鸭命令请求
        mWaiter.invoke(1);

        //思考下为什么不直接调用?
        mCook.cookDuck();
    }
}
