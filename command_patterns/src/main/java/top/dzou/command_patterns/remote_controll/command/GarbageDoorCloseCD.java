package top.dzou.command_patterns.remote_controll.command;

import top.dzou.command_patterns.remote_controll.receiver.garbage.Garbage;

/**
 * @author dingxiang
 * @date 19-8-7 下午10:26
 */
public class GarbageDoorCloseCD implements Command{
    private Garbage garbage;
    public GarbageDoorCloseCD(Garbage garbage){
        this.garbage = garbage;
    }
    public void undo() {
        garbage.open();
    }

    public void execute() {
        garbage.close();
    }
}
