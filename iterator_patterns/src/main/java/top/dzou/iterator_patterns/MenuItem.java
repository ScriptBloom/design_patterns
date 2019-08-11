package top.dzou.iterator_patterns;

import lombok.Data;

/**
 * @author dingxiang
 * @date 19-8-11 上午10:39
 */
@Data
public class MenuItem {
    private String name;
    private String des;
    private String price;

    public MenuItem(String name, String des, String price) {
        this.name = name;
        this.des = des;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
