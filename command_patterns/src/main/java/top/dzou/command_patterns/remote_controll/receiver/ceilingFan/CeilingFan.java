package top.dzou.command_patterns.remote_controll.receiver.ceilingFan;

/**
 * @author dingxiang
 * @date 19-8-7 下午10:12
 */

/**
 * 风扇
 */
public class CeilingFan {
    private SpeedEnum speed;
    public CeilingFan(){
        speed = SpeedEnum.MEDIUM;
    }
    public void setSpeed(SpeedEnum speed){
        this.speed = speed;
    }

    public SpeedEnum getSpeed() {
        return speed;
    }

    public void open(){
        System.out.println("打开风扇,风速为:"+speed.getDes());
    }

    public void close(){
        System.out.println("关闭风扇");
    }
}
