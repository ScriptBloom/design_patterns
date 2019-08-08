package top.dzou.singleton_mode.container;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dingxiang
 * @date 19-8-3 下午2:03
 */
public class Singleton {
    private static Map<String, Object> objMap = new HashMap<String,Object>();
    private Singleton() {
    }
    public static void registerService(String key, Object instance) {
        if (!objMap.containsKey(key) ) {
        objMap.put(key, instance) ;
    }
    }
    public static Object getService(String key) {
        return objMap.get(key) ;
    }
}