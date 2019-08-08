package top.dzou.facade_patterns;

/**
 * @author dingxiang
 * @date 19-8-8 下午12:15
 */

/**
 * 功放
 */
public class Amplifier {
    public void setDvdAndCd(){
        System.out.println("插上Dvd、Cd插座");
    }
    public void on(){
        System.out.println("打开功放");
    }
    public void setVolume(int i){
        System.out.println("设置音量"+i);
    }
    public void close(){
        System.out.println("关闭功放");
    }
}
