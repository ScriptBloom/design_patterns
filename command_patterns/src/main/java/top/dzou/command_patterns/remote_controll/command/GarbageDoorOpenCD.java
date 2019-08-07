package top.dzou.command_patterns.remote_controll.command;

import top.dzou.command_patterns.remote_controll.receiver.garbage.Garbage;

/**
 * @author dingxiang
 * @date 19-8-7 下午9:49
 */
public class GarbageDoorOpenCD implements Command{
    private Garbage garbage;
    public GarbageDoorOpenCD(Garbage garbage){
        this.garbage = garbage;
    }
    public void undo() {
        garbage.close();
    }

    public void execute() {
        garbage.open();
    }
}
