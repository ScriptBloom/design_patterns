package top.dzou.mediator_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午10:12
 */

/**
 * 测试
 */
public class ClientTest {
    public static void main(String[] args) {
        Mediator mediator = new DateMediator();
        DatingPerson a = new PersonA(mediator);
        DatingPerson b = new PersonB(mediator);
        DatingPerson c = new PersonC(mediator);
        DatingPerson d = new PersonD(mediator);
        a.makeOneDate("c");
        b.makeOneDate("d");

        c.makeOneDate("d");
        d.makeOneDate("a");
    }
}
