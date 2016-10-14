package cn.com.wankr.designpatterns.facade;

/**
 * 外观对象，对用户负责
 * Created by lei on 2016/10/14.
 */

public class Facade {

    private Light mLight = new Light();
    private AirCondition mAirCondition = new AirCondition();

    /**
     * 还可能会有方法集，比如我的习惯是下班回家，开灯、开空调，空调温度调节到20度
     */
    public void doMyHabit(){
        mLight.lightOn();
        mAirCondition.airConditionaOn();
        mAirCondition.setTemperature(20);
    }

    public void lightOn(){
        mLight.lightOn();
    }

    public void lightOff(){
        mLight.lightOff();
    }

    public void airConditionaOn() {
        mAirCondition.airConditionaOn();
    }

    public void airConditionaOff() {
        mAirCondition.airConditionaOff();
    }

    public void setTemperature(int temperature) {
        mAirCondition.setTemperature(temperature);
    }
}
