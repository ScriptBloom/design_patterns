package top.dzou.command_patterns.remote_controll.command;

import top.dzou.command_patterns.remote_controll.receiver.ceilingFan.CeilingFan;

/**
 * @author dingxiang
 * @date 19-8-7 下午10:12
 */
public class CeilingFanOffCD implements Command{
    private CeilingFan ceilingFan;

    /**
     * 命令具体实现类初始化时传入具体的命令接受者（执行）
     * @param fan 风扇
     */
    public CeilingFanOffCD(CeilingFan fan){
        ceilingFan = fan;
    }

    public void undo() {
        ceilingFan.open();
    }

    public void execute() {
        ceilingFan.close();
    }
}
