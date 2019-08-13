package top.dzou.proxy_patterns.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author dingxiang
 * @date 19-8-13 下午10:54
 */
public class SayHelloInvocationHandler implements InvocationHandler {
    private SayHello sayHello;
    public SayHelloInvocationHandler(SayHello sayHello){
        this.sayHello = sayHello;
    }
    public Object invoke(Object proxy, Method method, Object[] args) {
        try {
            System.out.println("before");
            Object o = method.invoke(sayHello, args);
            System.out.println("after");
            return o;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
