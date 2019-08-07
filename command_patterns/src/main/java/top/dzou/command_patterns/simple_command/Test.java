package top.dzou.command_patterns.simple_command;

/**
 * @author dingxiang
 * @date 19-8-7 上午10:16
 */
public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);
        RemoteControll controll = new RemoteControll();
        controll.setCommand(command);
        command.execute();
    }
}
