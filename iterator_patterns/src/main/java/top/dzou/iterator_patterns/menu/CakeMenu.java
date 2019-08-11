package top.dzou.iterator_patterns.menu;

import top.dzou.iterator_patterns.Iterator;
import top.dzou.iterator_patterns.Menu;
import top.dzou.iterator_patterns.MenuItem;
import top.dzou.iterator_patterns.iterator.ListIterator;

import java.util.ArrayList;

/**
 * @author dingxiang
 * @date 19-8-11 上午10:41
 */
public class CakeMenu implements Menu {
    private ArrayList<MenuItem> cakeItems;
    public CakeMenu(){
        cakeItems = new ArrayList<>();
        addItem("Bread","10.00","面包");
        addItem("Ice-cream","15.00","冰淇淋");
        addItem("Cake","20.00","饼干");
    }
    public void addItem(String name,String price,String des) {
        MenuItem item = new MenuItem(name,price,des);
        cakeItems.add(item);
    }

    public Iterator createIterator() {
        return new ListIterator(cakeItems);
    }
}
