package top.dzou.proxy_patterns.static_proxy;

import java.util.Arrays;

/**
 * @author dingxiang
 * @date 19-8-13 下午10:28
 */
public class Meal {
    private String[] names;
    public Meal(){
        names = new String[3];
        names[0] = "鱼香肉丝";
        names[1] = "宫保鸡丁";
        names[2] = "紫菜汤";
    }

    @Override
    public String toString() {
        return "Meal{" +
                "names=" + Arrays.toString(names) +
                '}';
    }
}
