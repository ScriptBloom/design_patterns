package top.dzou.proxy_patterns.static_proxy;

/**
 * @author dingxiang
 * @date 19-8-13 下午10:33
 */
public class Test {
    public static void main(String[] args) {
        ChefAcceptOrder acceptOrder = new ChefAcceptOrder();
        WaitressProxy proxy = new WaitressProxy(acceptOrder);
        proxy.order();
    }
}
