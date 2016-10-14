package cn.com.wankr.designpatterns.facade;

import android.util.Log;

/**
 * 智能家居中的灯
 * Created by lei on 2016/10/14.
 */

public class Light {

    public void lightOn(){
        Log.e("Light","on");
    }

    public void lightOff(){
        Log.e("Light","off");
    }
}
