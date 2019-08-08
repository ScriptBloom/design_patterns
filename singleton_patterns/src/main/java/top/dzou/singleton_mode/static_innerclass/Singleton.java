package top.dzou.singleton_mode.static_innerclass;

/**
 * @author dingxiang
 * @date 19-8-3 下午2:04
 */
public class Singleton {
    private Singleton(){
    }
    public static Singleton getInstance(){
        return SingletonHolder.sInstance;
    }
    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }
}