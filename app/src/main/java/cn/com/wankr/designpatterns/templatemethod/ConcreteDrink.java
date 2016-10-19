package cn.com.wankr.designpatterns.templatemethod;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * 具体的饮料，比如奶茶
 * Created by lei on 2016/10/19.
 */

public class ConcreteDrink extends TemplateDrink {

    @Override
    public void getGlass() {
        Log.e(TAG, "中杯--->");
    }

    @Override
    public void getContent() {
        Log.e(TAG, "奶茶--->");
    }

    @Override
    public boolean hook() {
        return super.hook();
    }
}
