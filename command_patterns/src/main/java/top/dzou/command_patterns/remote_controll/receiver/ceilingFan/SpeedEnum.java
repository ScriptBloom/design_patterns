package top.dzou.command_patterns.remote_controll.receiver.ceilingFan;

/**
 * @author dingxiang
 * @date 19-8-7 下午10:47
 */
public enum SpeedEnum {
    SMALL(1,"小风")
    ,MEDIUM(5,"中风")
    ,BIG(10,"大风");

    private int speed;
    private String des;
    SpeedEnum(int speed, String des) {
        this.des = des;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getDes() {
        return des;
    }
}
