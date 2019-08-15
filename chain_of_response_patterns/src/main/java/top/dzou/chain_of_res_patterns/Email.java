package top.dzou.chain_of_res_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 上午11:57
 */
public enum Email {
    FANS(1,"粉丝邮件"),
    COMPLAIN(2,"抱怨产品邮件"),
    TRASH(3,"垃圾邮件");

    private int i;
    private String kind;
    Email(int i, String kind) {
        this.i = i;
        this.kind = kind;
    }
    public String getKind(){
        return kind;
    }
}
