package top.dzou.command_patterns.remote_controll.command;

import top.dzou.command_patterns.remote_controll.receiver.ceilingFan.CeilingFan;
import top.dzou.command_patterns.remote_controll.receiver.ceilingFan.SpeedEnum;

/**
 * @author dingxiang
 * @date 19-8-7 下午10:11
 */
public class CeilingFanOnCD implements Command{
    private CeilingFan ceilingFan;
    //记录前一次风速实现撤销
    private SpeedEnum prevSpeed;
    public CeilingFanOnCD(CeilingFan fan){
        ceilingFan = fan;
    }

    public void undo() {
        if(prevSpeed.equals(SpeedEnum.BIG)){
            ceilingFan.setSpeed(SpeedEnum.BIG);
        }else if(prevSpeed.equals(SpeedEnum.MEDIUM)){
            ceilingFan.setSpeed(SpeedEnum.MEDIUM);
        }else if(prevSpeed.equals(SpeedEnum.SMALL)){
            ceilingFan.setSpeed(SpeedEnum.SMALL);
        }
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.open();
    }
}
