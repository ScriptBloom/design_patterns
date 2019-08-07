package top.dzou.command_patterns.simple_command;

/**
 * @author dingxiang
 * @date 19-8-7 上午10:13
 */
public class Light {
    private boolean isOn = false;

    public void on(){
        isOn = true;
        System.out.println("Light is opened");
    }
}
