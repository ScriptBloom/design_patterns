package top.dzou.proxy_patterns.dynamic_proxy;

/**
 * @author dingxiang
 * @date 19-8-13 下午10:55
 */
/**
 * 调用方法接口实现
 */
public class SayHelloImpl implements SayHello {
    public void sayHello() {
        System.out.println("hello");
    }
}
