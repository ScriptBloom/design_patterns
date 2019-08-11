package top.dzou.composite_patterns;

import top.dzou.composite_patterns.component.Menu;
import top.dzou.composite_patterns.component.MenuItem;

/**
 * @author dingxiang
 * @date 19-8-11 下午12:14
 */
public class TestOrder {
    public static void main(String[] args) {
        MenuComponent cakeMenu = new Menu("cake","饼干类");
        MenuComponent dinnerMenu = new Menu("dinner","晚餐");
        MenuComponent coffeeMenu = new Menu("coffee","小吃甜点咖啡");
        cakeMenu.add(new MenuItem("Bread","10.00","面包"));
        cakeMenu.add(new MenuItem("Ice-cream","15.00","冰淇淋"));
        cakeMenu.add(new MenuItem("Cake","20.00","饼干"));

        coffeeMenu.add(new MenuItem("Moka","10.00","摩卡咖啡"));
        coffeeMenu.add(new MenuItem("Fragrant","15.00","香浓咖啡"));
        coffeeMenu.add(new MenuItem("Milk","20.00","牛奶咖啡"));

        dinnerMenu.add(new MenuItem("fish","100.00","糖醋鱼"));
        dinnerMenu.add(new MenuItem("chicken","125.00","辣子鸡"));
        dinnerMenu.add(new MenuItem("duck","200.00","北京烤鸭"));

        MenuComponent allMenus = new Menu("allMenus","所有菜单");
        allMenus.add(cakeMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(coffeeMenu);
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
