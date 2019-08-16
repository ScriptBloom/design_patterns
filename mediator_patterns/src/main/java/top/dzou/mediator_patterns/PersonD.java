package top.dzou.mediator_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午10:12
 */
public class PersonD extends DatingPerson{
    public PersonD(Mediator mediator){
        this.mediator = mediator;
        name = "d";
        this.mediator.register(this);
    }
}
