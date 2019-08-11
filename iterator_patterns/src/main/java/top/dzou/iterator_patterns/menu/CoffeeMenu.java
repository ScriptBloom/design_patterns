package top.dzou.iterator_patterns.menu;

import top.dzou.iterator_patterns.Iterator;
import top.dzou.iterator_patterns.Menu;
import top.dzou.iterator_patterns.MenuItem;
import top.dzou.iterator_patterns.iterator.ArrayIterator;

/**
 * @author dingxiang
 * @date 19-8-11 上午10:36
 */
public class CoffeeMenu implements Menu {
    private MenuItem[] menuItems;
    private final int MAX_SIZE = 10;
    private int i;
    public CoffeeMenu(){
        menuItems = new MenuItem[MAX_SIZE];
        addItem("Moka","10.00","摩卡咖啡");
        addItem("Fragrant","15.00","香浓咖啡");
        addItem("Milk","20.00","牛奶咖啡");
    }
    public void addItem(String name,String price,String des) {
        MenuItem item = new MenuItem(name,price,des);
        menuItems[i] = item;
        i++;
    }

    public Iterator createIterator() {
        return new ArrayIterator(menuItems);
    }
}
