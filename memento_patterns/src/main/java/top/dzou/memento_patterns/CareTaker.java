package top.dzou.memento_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingxiang
 * @date 19-8-16 上午11:33
 */

/**
 * 负责人，负责保存所有备忘录
 */
public class CareTaker {
    private List<Memento> list;
    public CareTaker(){
        list = new ArrayList<>();
    }
    //添加备忘录
    public void add(Memento memento){
        list.add(memento);
    }
    //获得备忘录，从中可以获得状态
    public Memento get(int i){
        return list.get(i);
    }
}
