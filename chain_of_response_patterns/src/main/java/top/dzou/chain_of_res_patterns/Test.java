package top.dzou.chain_of_res_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 上午11:55
 */
public class Test {
    //设置处理链
    public static EmailHandler getAndsetEmailHandlerChain(){
        EmailHandler fansHandler  = new FansEmailHandler();
        EmailHandler complainHandler = new ComplainEmailHandler();
        EmailHandler trashHandler = new TrashEmailHandler();
        trashHandler.setNextHandler(complainHandler);
        complainHandler.setNextHandler(fansHandler);
        return trashHandler;
    }
    public static void main(String[] args) {
        EmailHandler firstHandler = Test.getAndsetEmailHandlerChain();
        firstHandler.handlerEmail(Email.COMPLAIN);
        System.out.println("\n");
        firstHandler.handlerEmail(Email.FANS);
        System.out.println("\n");
        firstHandler.handlerEmail(Email.TRASH);
    }
}
