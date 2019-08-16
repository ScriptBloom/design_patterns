package top.dzou.mediator_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午10:12
 */
public class PersonC extends DatingPerson{
    public PersonC(Mediator mediator){
        this.mediator = mediator;
        name = "c";
        this.mediator.register(this);
    }
}
