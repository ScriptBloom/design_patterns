package top.zou.observer_patterns;

/**
 * @author dingxiang
 * @date 19-8-4 上午10:24
 */

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 更新数据
     * @param subject 主题对象
     * @param args 更新参数
     */
    void update(Subject subject,Object args);
}
