package top.dzou.memento_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午11:32
 */

/**
 * 发起者 负责状态的使用、设置和恢复
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //保存状态
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    //从备忘录恢复状态
    public void restoreStateFromMemento(Memento memento){
        setState(memento.getState());
    }
}
