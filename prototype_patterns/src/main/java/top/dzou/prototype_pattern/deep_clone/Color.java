package top.dzou.prototype_pattern.deep_clone;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author dingxiang
 * @date 19-8-16 下午1:12
 */
@AllArgsConstructor
@Data
public class Color implements Serializable,Cloneable {
    private String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Color color = null;
        color = (Color) super.clone();
        return color;
    }
}
