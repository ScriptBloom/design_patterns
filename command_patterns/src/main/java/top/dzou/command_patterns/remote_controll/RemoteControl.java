package top.dzou.command_patterns.remote_controll;

import top.dzou.command_patterns.remote_controll.command.Command;
import top.dzou.command_patterns.remote_controll.command.NoCommand;

/**
 * @author dingxiang
 * @date 19-8-7 下午10:17
 */

/**
 * 遥控器
 */
public class RemoteControl {
    /**
     * 一个遥控器存储九个按键（四开四关 一个撤销）
     */
    private Command[] onCommand;
    private Command[] offCommand;

    private Command undoFlagCommand;
    public RemoteControl(){
        onCommand = new Command[5];
        offCommand = new Command[5];
        Command noCommand = new NoCommand();
        for(int i=0;i<4;i++){
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
            undoFlagCommand = noCommand;
        }
    }

    public void setCommand(int i,Command onCommand,Command offCommand){
        this.onCommand[i] = onCommand;
        this.offCommand[i] = offCommand;
    }

    public void onButtonPush(int slot){
        onCommand[slot].execute();
        undoFlagCommand = onCommand[slot];
    }

    public void offButtonPush(int slot){
        offCommand[slot].execute();
        undoFlagCommand = offCommand[slot];
    }

    public void onUndoButtonPush(){
        undoFlagCommand.undo();
    }
}
