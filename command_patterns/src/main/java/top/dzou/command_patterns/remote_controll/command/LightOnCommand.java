package top.dzou.command_patterns.remote_controll.command;

import top.dzou.command_patterns.remote_controll.receiver.light.Light;

/**
 * @author dingxiang
 * @date 19-8-7 上午10:37
 */
public class LightOnCommand implements Command{
    private Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void undo() {
        light.off();
    }

    public void execute() {
        light.on();
    }
}
