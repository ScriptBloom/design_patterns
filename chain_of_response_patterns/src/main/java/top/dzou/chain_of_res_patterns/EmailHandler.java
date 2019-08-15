package top.dzou.chain_of_res_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 上午11:52
 */
public abstract class EmailHandler {
    private EmailHandler nextHandler;

    public void setNextHandler(EmailHandler handler){
        this.nextHandler = handler;
    }
    public EmailHandler getNextHandler(){
        return nextHandler;
    }
    public abstract void handlerEmail(Email email);
}
