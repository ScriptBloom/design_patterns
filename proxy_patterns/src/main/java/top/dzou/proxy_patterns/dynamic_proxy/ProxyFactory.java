package top.dzou.proxy_patterns.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * @author dingxiang
 * @date 19-8-13 下午10:57
 */
public class ProxyFactory {
    //维护一个目标对象
    private SayHello target;
    public ProxyFactory(SayHello target){
        this.target=target;
    }
    public Object getNewProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new SayHelloInvocationHandler(target));
    }
}
