package top.dzou.proxy_patterns.static_proxy;

/**
 * @author dingxiang
 * @date 19-8-13 下午10:31
 */

/**
 * 代理类——女服务员
 */
public class WaitressProxy implements MenuOrder{
    private ChefAcceptOrder acceptOrder;
    public WaitressProxy(ChefAcceptOrder acceptOrder){
        this.acceptOrder = acceptOrder;
    }
    public void order() {
        System.out.println("请您稍等，正在为你备餐");
        acceptOrder.order();
        System.out.println("请您享用");
    }
}
