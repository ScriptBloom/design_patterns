package top.dzou.memento_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 上午11:33
 */

/**
 * 备忘录对象 主要负责保存维护状态
 */
public class Memento {
    public String getState() {
        return state;
    }

    private String state;
    public Memento(String state) {
        this.state = state;
    }
}
