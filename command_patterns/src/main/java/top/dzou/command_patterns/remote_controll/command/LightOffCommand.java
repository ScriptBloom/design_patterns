package top.dzou.command_patterns.remote_controll.command;

import top.dzou.command_patterns.remote_controll.receiver.light.Light;

/**
 * @author dingxiang
 * @date 19-8-7 下午10:27
 */
public class LightOffCommand implements Command{
    private Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    public void undo() {
        light.on();
    }

    public void execute() {
        light.off();
    }
}
