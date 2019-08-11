package top.dzou.iterator_patterns.iterator;

import top.dzou.iterator_patterns.Iterator;
import top.dzou.iterator_patterns.Menu;
import top.dzou.iterator_patterns.MenuItem;

/**
 * @author dingxiang
 * @date 19-8-11 上午10:39
 */
public class ArrayIterator implements Iterator {
    private MenuItem[] menuItems;
    private int index;
    public ArrayIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }
    @Override
    public Object next() {
        return menuItems[index++];
    }

    @Override
    public boolean hasNext() {
        if(index==menuItems.length||menuItems[index]==null){
            return false;
        }
        return true;
    }
}
