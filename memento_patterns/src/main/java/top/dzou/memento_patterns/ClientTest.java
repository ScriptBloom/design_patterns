package top.dzou.memento_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午11:33
 */

/**
 * 测试
 */
public class ClientTest {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("状态1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态3");
        careTaker.add(originator.saveStateToMemento());
        System.out.println("当前状态："+originator.getState());
        //恢复到1状态
        System.out.println("我想要恢复到状态1");
        originator.restoreStateFromMemento(careTaker.get(0));
        System.out.println("当前状态："+originator.getState());
    }
}
