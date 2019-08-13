package top.dzou.proxy_patterns.dynamic_proxy;

/**
 * @author dingxiang
 * @date 19-8-13 下午11:06
 */
public class TestMain {
    public static void main(String[] args) {
        SayHelloImpl sayHello = new SayHelloImpl();
        ProxyFactory proxyFactory = new ProxyFactory(sayHello);
        SayHello proxy = (SayHello) proxyFactory.getNewProxy();
        proxy.sayHello();
    }
}
