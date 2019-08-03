package top.dzou.singleton_mode.double_check;

/**
 * @author dingxiang
 * @date 19-8-3 下午2:04
 */
public class Singleton {
    private volatile static Singleton instance;
    private Singleton (){
    }
    public static Singleton getInstance() {
        if (instance== null) {
            synchronized (Singleton.class) {
                if (instance== null) {
                    instance= new Singleton();
                }
            }
        }
        return instance;
    }
}