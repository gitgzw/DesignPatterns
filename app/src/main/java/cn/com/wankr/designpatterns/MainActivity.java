package cn.com.wankr.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cn.com.wankr.designpatterns.adapter.CAdapter;
import cn.com.wankr.designpatterns.adapter.OAdapter;
import cn.com.wankr.designpatterns.adapter.IPhoneSeven;
import cn.com.wankr.designpatterns.command.Client;
import cn.com.wankr.designpatterns.facade.Facade;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testCommand();

        testAdapter();

        testFacade();
    }

    /**
     * 测试命令模式的方法
     */
    private void testCommand() {
        Client client = new Client();
        client.assembleAction();
    }

    /**
     * 测试适配器模式的方法
     */
    private void testAdapter() {
        IPhoneSeven iPhoneSeven = new IPhoneSeven();
        OAdapter oAdapter = new OAdapter(iPhoneSeven);
        Log.e("对象适配器", oAdapter.getRightInterface());

        CAdapter cAdapter = new CAdapter();
        Log.e("类适配器", cAdapter.getRightInterface());
    }

    /**
     * 测试外观模式的方法
     */
    private void testFacade() {
        Facade facade = new Facade();
//        facade.lightOn();
//        facade.airConditionaOn();
        facade.doMyHabit();
    }
}
