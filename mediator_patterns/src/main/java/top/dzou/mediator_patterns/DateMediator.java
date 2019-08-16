package top.dzou.mediator_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午10:10
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 相亲中介所
 */
public class DateMediator extends Mediator{
    private Map<String,DatingPerson> datingPeople;//存放所有要相亲的人
    public DateMediator(){
        datingPeople = new HashMap<>();
    }
    //把要相亲的人注册到中介所
    public void register(DatingPerson person) {
        datingPeople.put(person.getName(),person);
    }

    //回应约会请求
    @Override
    public void response(String datingPerson,String datedPerson) {
        DatingPerson person = datingPeople.get(datedPerson);//获取被约会对象
        if(datingPerson.equals("c")){//所有人都不想和c约会
            person.refuse(datingPerson);//被约会对象拒绝
        }else {
            person.accept(datingPerson);//被约会对象接受
        }
    }
}
