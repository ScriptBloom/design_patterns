package top.dzou.factory_patterns.factory_method_pattern;

import top.dzou.factory_patterns.factory_method_pattern.store.ChicagoPizzaStore;
import top.dzou.factory_patterns.factory_method_pattern.store.LAPizzaStore;
import top.dzou.factory_patterns.factory_method_pattern.store.NYPizzaStore;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:34
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore laStore = new LAPizzaStore();
        PizzaStore nyStore = new NYPizzaStore();
        chicagoStore.orderPizza(PizzaEnum.CHEESE);
        laStore.orderPizza(PizzaEnum.CLAM);
        nyStore.orderPizza(PizzaEnum.VEGGIE);
    }
}
