package top.dzou.command_patterns.simple_command;

/**
 * @author dingxiang
 * @date 19-8-7 上午10:12
 */
public class LightOnCommand implements Command{
    private Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
