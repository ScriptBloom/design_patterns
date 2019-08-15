package top.dzou.chain_of_res_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 上午11:54
 */

/**
 * 粉丝邮件处理
 */
public class FansEmailHandler extends EmailHandler{
    public void handlerEmail(Email email) {
        if(email.equals(Email.FANS)){
            System.out.println("这封邮件是："+email.getKind());
            System.out.println("交给老板处理");
        }
    }
}
