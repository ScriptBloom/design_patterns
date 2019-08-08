package top.dzou.singleton_mode.ehan;

/**
 * @author dingxiang
 * @date 19-8-3 下午2:04
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){
    }
    public static Singleton getInstance() {
        return instance;
    }
}