package cn.com.wankr.designpatterns.command;

import android.util.Log;

/**
 * Created by lei on 2016/9/30.
 */

public class Cook {

    //烤乳猪的方法
    public void cookPig(){
        Log.e("cook","pig");
    }

    //烧花鸭的方法
    public void cookDuck(){
        Log.e("cook","duck");
    }
}
