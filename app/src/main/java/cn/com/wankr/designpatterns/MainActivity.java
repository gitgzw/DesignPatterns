package cn.com.wankr.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cn.com.wankr.designpatterns.Adapter.CAdapter;
import cn.com.wankr.designpatterns.Adapter.OAdapter;
import cn.com.wankr.designpatterns.Adapter.IPhoneSeven;
import cn.com.wankr.designpatterns.command.Client;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testCommand();

        testAdapter();
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
        Log.d("对象适配器", oAdapter.getRightInterface());

        CAdapter cAdapter = new CAdapter();
        Log.d("类适配器", cAdapter.getRightInterface());
    }
}
