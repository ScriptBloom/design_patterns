package top.dzou.proxy_patterns.remote_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author dingxiang
 * @date 19-8-13 上午11:57
 */

/**
 * 远程方法调用接口
 */
public interface MyRemote extends Remote {
    public String doSomething() throws RemoteException;
}
