package top.dzou.composite_patterns.component;

import top.dzou.composite_patterns.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author dingxiang
 * @date 19-8-11 上午11:49
 */
public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> menuList;
    private String name;
    private String des;
    public Menu(String name,String des){
        menuList = new ArrayList<>();
        this.des = des;
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("menu name:"+getName()+
                "\n"+"menu des:"+getDes());
        Iterator iterator = menuList.iterator();
        while (iterator.hasNext()){
            MenuComponent component = (MenuComponent) iterator.next();
            component.print();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDes() {
        return des;
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuList.get(i);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuList.remove(menuComponent);
    }
}
