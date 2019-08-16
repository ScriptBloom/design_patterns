package top.dzou.prototype_pattern.shallow_clone;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @author dingxiang
 * @date 19-8-16 下午1:02
 */

/**
 * 绵羊类
 */
@Data
@AllArgsConstructor
public class Sheep implements Cloneable{
    private Color color;//保存引用 非基本类型
    private String name;
    private String age;

    @Override
    public String toString() {
        return "Sheep{" +
                "color=" + color.getColor() +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        sheep = (Sheep) super.clone();
        return sheep;
    }
}
