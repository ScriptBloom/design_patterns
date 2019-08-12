package top.dzou.state_patterns;

/**
 * @author dingxiang
 * @date 19-8-12 上午10:44
 */
public abstract class State {
    protected void insertMoney(){
        System.out.println("错误的请求");
    }
    protected void returnMoney(){
        System.out.println("错误的请求");
    }
    protected void turnCrank(){
        System.out.println("错误的请求");
    }
    protected void distribute(){
        System.out.println("错误的请求");
    }
}
