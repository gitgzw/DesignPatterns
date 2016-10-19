package cn.com.wankr.designpatterns.templatemethod;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * 饮料模板
 * Created by lei on 2016/10/19.
 */

public abstract class TemplateDrink {

    /**
     * 获取饮料的方法，用final修饰，防止被子类修改算法结构。模板方法
     */
    public final void getDrink() {
        getGlass();
        getContent();
        if (hook()) {
            Log.e(TAG, "加冰--->");
        } else {
            Log.e(TAG, "不加冰--->");
        }
        pack();
    }

    /**
     * 获取杯子，杯子分大中小杯
     */
    public abstract void getGlass();

    /**
     * 获取具体种类饮料
     */
    public abstract void getContent();

    /**
     * 夏天我们的饮料是默认加冰的。钩子方法
     */
    public boolean hook() {
        return true;
    }

    /**
     * 打包
     */
    public void pack() {
        Log.e(TAG, "包装");
    }
}
