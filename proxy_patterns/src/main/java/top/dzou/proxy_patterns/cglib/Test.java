package top.dzou.proxy_patterns.cglib;

/**
 * @author dingxiang
 * @date 19-8-13 下午11:18
 */
public class Test {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        ProxyFactory proxyFactory = new ProxyFactory(taskService);
        TaskService cglib = (TaskService) proxyFactory.getNewProxy();
        cglib.doTask();
    }
}
