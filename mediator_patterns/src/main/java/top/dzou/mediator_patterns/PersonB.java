package top.dzou.mediator_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午10:12
 */
public class PersonB extends DatingPerson {
    public PersonB(Mediator mediator) {
        this.mediator = mediator;
        name = "b";
        this.mediator.register(this);
    }
}
