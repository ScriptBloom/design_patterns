package top.dzou.iterator_patterns;

import top.dzou.iterator_patterns.menu.CakeMenu;
import top.dzou.iterator_patterns.menu.CoffeeMenu;
import top.dzou.iterator_patterns.menu.DinnerMenu;

import java.util.Hashtable;

/**
 * @author dingxiang
 * @date 19-8-11 上午10:40
 */
public class TestOrder {
    public static void main(String[] args) {
        CakeMenu cakeMenu = new CakeMenu();
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(cakeMenu,coffeeMenu,dinnerMenu);
        waitress.printMenu();
    }
}
