package top.dzou.singleton_mode.lanhan;

/**
 * @author dingxiang
 * @date 19-8-3 下午2:04
 */

/**
 * 线程安全
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2 (){
    }
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}