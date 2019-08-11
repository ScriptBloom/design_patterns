package top.dzou.iterator_patterns.menu;

import top.dzou.iterator_patterns.Iterator;
import top.dzou.iterator_patterns.Menu;
import top.dzou.iterator_patterns.MenuItem;
import top.dzou.iterator_patterns.iterator.ListIterator;

import java.util.LinkedList;
import java.util.Vector;

/**
 * @author dingxiang
 * @date 19-8-11 上午10:40
 */
public class DinnerMenu implements Menu {
    private LinkedList<MenuItem> dinnerItems;
    private int i;
    public DinnerMenu(){
        dinnerItems = new LinkedList<>();
        addItem("fish","100.00","糖醋鱼");
        addItem("chicken","125.00","辣子鸡");
        addItem("duck","200.00","北京烤鸭");
    }
    public void addItem(String name,String price,String des) {
        MenuItem item = new MenuItem(name,price,des);
        dinnerItems.add(item);
    }

    public Iterator createIterator() {
        return new ListIterator(dinnerItems);
    }
}
