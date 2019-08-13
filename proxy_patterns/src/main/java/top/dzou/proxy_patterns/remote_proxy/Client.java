package top.dzou.proxy_patterns.remote_proxy;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author dingxiang
 * @date 19-8-13 下午12:08
 */

/**
 * 客户端测试远程调用
 */
public class Client {
    public static void main(String[] args) {
        try {
            MyRemote remote = new MyRemoteImpl();
            Context context = new InitialContext();
            LocateRegistry.createRegistry(8090);
            context.bind("rmi://localhost:8090/myRemoteService",remote);

            MyRemote remote1 = (MyRemote) context.lookup("rmi://localhost:8090/myRemoteService");
            System.out.println(remote1.doSomething());
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
