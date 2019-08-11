package top.dzou.iterator_patterns.iterator;

import top.dzou.iterator_patterns.Iterator;
import top.dzou.iterator_patterns.MenuItem;
import top.dzou.iterator_patterns.menu.CakeMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingxiang
 * @date 19-8-11 上午10:49
 */
public class ListIterator implements Iterator {
    private List<MenuItem> menuItems;
    private int index = 0;
    public ListIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }
    @Override
    public Object next() {
        return menuItems.get(index++);
    }

    @Override
    public boolean hasNext() {
        if(index == menuItems.size()||menuItems.get(index)==null){
            return false;
        }
        return true;
    }
}
