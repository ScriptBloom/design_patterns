package top.dzou.composite_patterns.component;

import top.dzou.composite_patterns.MenuComponent;

/**
 * @author dingxiang
 * @date 19-8-11 上午11:48
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String des;
    private String price;
    public MenuItem(String name, String des, String price) {
        this.name = name;
        this.des = des;
        this.price = price;
    }
    @Override
    public String getDes() {
        return des;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("MenuItem{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                ", price='" + price + '\'' +
                '}');
    }
}
