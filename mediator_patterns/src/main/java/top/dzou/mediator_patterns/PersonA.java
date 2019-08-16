package top.dzou.mediator_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午10:12
 */
public class PersonA extends DatingPerson {
    public PersonA(Mediator mediator) {
        this.mediator = mediator;
        name = "a";
        this.mediator.register(this);
    }
}
