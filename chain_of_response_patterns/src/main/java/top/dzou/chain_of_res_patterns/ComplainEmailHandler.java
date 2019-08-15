package top.dzou.chain_of_res_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 上午11:55
 */

/**
 * 抱怨邮件处理
 */
public class ComplainEmailHandler extends EmailHandler{
    public void handlerEmail(Email email) {
        if(email.equals(Email.COMPLAIN)){
            System.out.println("这封邮件是："+email.getKind());
            System.out.println("交给产品部处理");
        }else {
            getNextHandler().handlerEmail(email);
        }
    }
}
