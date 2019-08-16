package top.dzou.visit_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 下午6:15
 */

/**
 * 元素接口
 */
public interface Element {
    public void accept(Visitor visitor);
}
