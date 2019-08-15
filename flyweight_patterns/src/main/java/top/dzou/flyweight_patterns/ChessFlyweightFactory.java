package top.dzou.flyweight_patterns;

import java.util.HashMap;

/**
 * @author dingxiang
 * @date 19-8-15 下午1:49
 */

/**
 * 棋子工厂类
 */
public class ChessFlyweightFactory {
    //定义一个HashMap用于存储享元对象，实现享元池
    private HashMap<Color,FlyWeight> flyweights = new HashMap<>();
    public FlyWeight getFlyweight(Color color){
        //如果对象存在，则直接从享元池获取
        if(flyweights.containsKey(color)){
            return flyweights.get(color);
        }
        //如果对象不存在，先创建一个新的对象添加到享元池中，然后返回
        else {
            FlyWeight fw = new ChessFlyWeight();
            fw.setColor(color);
            flyweights.put(fw.getColor(),fw);
            return fw;
        }
    }
}
