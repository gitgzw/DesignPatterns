package cn.com.wankr.designpatterns.facade;

import android.util.Log;

/**
 * 智能家居中的空调
 * Created by lei on 2016/10/14.
 */

public class AirCondition {

    public void airConditionaOn() {
        Log.e("AirCondition", "on");
    }

    public void airConditionaOff() {
        Log.e("AirCondition", "off");
    }

    public void setTemperature(int temperature) {
        Log.e("AirCondition", "temperature:" + temperature);
    }
}
