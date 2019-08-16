package top.dzou.mediator_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午10:10
 */

/**
 * 中介者抽象类
 */
public abstract class Mediator {
    public abstract void register(DatingPerson person);//注册到中介所
    public abstract void response(String datingPerson,String datedPerson);//回应相亲对象的是否接受
}
