package cn.com.wankr.designpatterns.command;

/**
 * Created by lei on 2016/9/30.
 */

public class DuckCook implements Command {

    private Cook mCook;

    public DuckCook(Cook cook) {
        mCook = cook;
    }

    @Override
    public void execute() {
        mCook.cookDuck();
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
