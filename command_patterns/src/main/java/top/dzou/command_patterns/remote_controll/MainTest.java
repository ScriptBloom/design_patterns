package top.dzou.command_patterns.remote_controll;

import top.dzou.command_patterns.remote_controll.command.*;
import top.dzou.command_patterns.remote_controll.receiver.ceilingFan.CeilingFan;
import top.dzou.command_patterns.remote_controll.receiver.garbage.Garbage;
import top.dzou.command_patterns.remote_controll.receiver.light.BedroomLight;
import top.dzou.command_patterns.remote_controll.receiver.light.KitchenLight;

/**
 * @author dingxiang
 * @date 19-8-7 下午10:23
 */
public class MainTest {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        BedroomLight bedroomLight = new BedroomLight();
        KitchenLight kitchenLight = new KitchenLight();
        Garbage garbage = new Garbage();
        CeilingFan ceilingFan = new CeilingFan();

        //1
        CeilingFanOnCD ceilingFanOnCD = new CeilingFanOnCD(ceilingFan);
        CeilingFanOffCD ceilingFanOffCD = new CeilingFanOffCD(ceilingFan);
        control.setCommand(1,ceilingFanOnCD,ceilingFanOffCD);
        control.onButtonPush(1);
        control.offButtonPush(1);
//        状态撤销
        control.onUndoButtonPush();

        //2
        LightOnCommand bedroomCD = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomOffCD = new LightOffCommand(bedroomLight);
        control.setCommand(2,bedroomCD,bedroomOffCD);
        control.onButtonPush(2);
        control.offButtonPush(2);

        //3
        LightOnCommand kitchenOnCD = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenOffCD = new LightOffCommand(kitchenLight);
        control.setCommand(3,kitchenOnCD,kitchenOffCD);
        control.onButtonPush(3);
        control.offButtonPush(3);

        //4
        GarbageDoorOpenCD garbageDoorOpenCD = new GarbageDoorOpenCD(garbage);
        GarbageDoorCloseCD garbageDoorCloseCD = new GarbageDoorCloseCD(garbage);
        control.setCommand(4,garbageDoorOpenCD,garbageDoorCloseCD);
        control.onButtonPush(4);
        control.offButtonPush(4);
        //test undo
        control.onUndoButtonPush();
    }
}
