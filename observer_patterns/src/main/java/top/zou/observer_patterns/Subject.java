package top.zou.observer_patterns;

import java.util.List;

/**
 * @author dingxiang
 * @date 19-8-4 上午10:24
 */

/**
 * 主题接口
 */
public interface Subject {
    /**
     * 观察者添加到主题管理对象中
     * @param o 观察者
     */
    void registerObserver(Observer o);

    /**
     * 观察者从主题对象中删除
     * @param o 观察者
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者更新数据
     * @param o 观察者列表
     */
    void notifyObservers(List<Observer> o);

    /**
     * 设置更新状态为True
     */
    void setChanged();

    /**
     * 获取更新状态
     * True 已更新
     * False未更新
     * @return boolean
     */
    boolean getChanged();
}
