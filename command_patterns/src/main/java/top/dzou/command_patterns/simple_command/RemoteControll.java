package top.dzou.command_patterns.simple_command;

/**
 * @author dingxiang
 * @date 19-8-7 上午10:14
 */
public class RemoteControll {
    private Command command;
    public RemoteControll(){}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonDown(){
        command.execute();
    }
}
