package top.dzou.proxy_patterns.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author dingxiang
 * @date 19-8-13 下午11:13
 */

/**
 * 获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }
    public Object getNewProxy(){
        //Cglib工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始执行");
        Object res = method.invoke(target,objects);
        System.out.println("结束执行");
        return res;
    }
}
