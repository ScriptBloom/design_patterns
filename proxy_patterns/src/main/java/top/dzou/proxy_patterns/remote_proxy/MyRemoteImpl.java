package top.dzou.proxy_patterns.remote_proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author dingxiang
 * @date 19-8-13 上午11:59
 */

/**
 * 远程方法调用实现——还需继承`UnicastRemoteObject`
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    protected MyRemoteImpl() throws RemoteException {
    }

    public String doSomething() throws RemoteException {
        return "我完成了一件事。";
    }
}
