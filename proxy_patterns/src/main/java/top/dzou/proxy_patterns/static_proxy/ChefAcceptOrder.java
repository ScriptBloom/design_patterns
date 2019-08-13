package top.dzou.proxy_patterns.static_proxy;

/**
 * @author dingxiang
 * @date 19-8-13 下午10:27
 */

/**
 * 被代理类——厨师
 */
public class ChefAcceptOrder implements MenuOrder{
    public void order() {
        System.out.println( new Meal().toString());
    }
}
