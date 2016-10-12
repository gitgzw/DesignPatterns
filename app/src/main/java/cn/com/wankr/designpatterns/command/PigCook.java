package cn.com.wankr.designpatterns.command;

/**
 * Created by lei on 2016/9/30.
 */

public class PigCook implements Command {

    private Cook mCook;

    public PigCook(Cook cook) {
        mCook = cook;
    }

    @Override
    public void execute() {
        mCook.cookPig();
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
