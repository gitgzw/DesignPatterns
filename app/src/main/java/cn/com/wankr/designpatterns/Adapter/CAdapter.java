package cn.com.wankr.designpatterns.Adapter;

/**
 * 类适配器
 * Created by lei on 2016/10/12.
 */

public class CAdapter extends IPhoneSeven implements ITarget{

    @Override
    public String getRightInterface() {
        String newInterface = getInterface();
        return suit(newInterface);
    }

    /**
     * 转换操作
     * @param newInterface
     * @return
     */
    private String suit(String newInterface) {
        return "3.5mm interface";
    }
}
