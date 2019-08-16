package top.dzou.mediator_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午10:11
 */

/**
 * 相亲的人抽象类
 */
public abstract class DatingPerson {
    protected Mediator mediator;//保存中介所的引用
    protected String name;//名字
    public String getName(){
        return name;
    }
    //相亲操作，调用的对象与传入参数名字的人发起约会请求，中介所处理，都相同所以写在抽象类实现中
    public void makeOneDate(String datePersonName){
        System.out.println("我想和 "+datePersonName+" 约个会");
        mediator.response(this.getName(),datePersonName);
    }
    //接受
    public void accept(String name){
        System.out.println("我接受这次和 "+name+" 约会\n");
    }
    //拒绝
    public void refuse(String name) {
        System.out.println("我不想和 "+name+" 约会\n");
    }
}
