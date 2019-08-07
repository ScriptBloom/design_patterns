package top.dzou.command_patterns.remote_controll.receiver.light;

/**
 * @author dingxiang
 * @date 19-8-7 上午10:39
 */

/**
 * 厨房灯
 */
public class KitchenLight implements Light{
    public void on() {
        System.out.println("厨房灯打开");
    }

    public void off() {
        System.out.println("厨房灯关闭");
    }
}
