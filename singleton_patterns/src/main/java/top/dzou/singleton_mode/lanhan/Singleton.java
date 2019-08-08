package top.dzou.singleton_mode.lanhan;

/**
 * @author dingxiang
 * @date 19-8-3 下午2:04
 */

/**
 * 线程不安全
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}