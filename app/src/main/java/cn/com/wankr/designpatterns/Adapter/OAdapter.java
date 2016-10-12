package cn.com.wankr.designpatterns.adapter;

/**
 * 对象适配器
 * Created by lei on 2016/10/12.
 */

public class OAdapter implements ITarget {

    private IPhoneSeven mIPhoneSeven;

    public OAdapter(IPhoneSeven IPhoneSeven) {
        mIPhoneSeven = IPhoneSeven;
    }

    @Override
    public String getRightInterface() {
        String newInterface = mIPhoneSeven.getInterface();
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
