package top.dzou.prototype_pattern.shallow_clone;

/**
 * @author dingxiang
 * @date 19-8-16 下午1:24
 */

/**
 * 颜色
 */
public class Color implements Cloneable {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    //重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Color color = null;
        color = (Color) super.clone();
        return color;
    }
}
