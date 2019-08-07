package top.dzou.command_patterns.remote_controll.receiver.light;

/**
 * @author dingxiang
 * @date 19-8-7 上午10:38
 */

/**
 * 卧室灯
 */
public class BedroomLight implements Light{
    public void on() {
        System.out.println("卧室灯打开");
    }

    public void off() {
        System.out.println("卧室灯关闭");
    }
}
