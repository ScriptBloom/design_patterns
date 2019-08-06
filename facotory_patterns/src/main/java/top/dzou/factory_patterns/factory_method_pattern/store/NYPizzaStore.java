package top.dzou.factory_patterns.factory_method_pattern.store;

import top.dzou.factory_patterns.factory_method_pattern.Pizza;
import top.dzou.factory_patterns.factory_method_pattern.PizzaEnum;
import top.dzou.factory_patterns.factory_method_pattern.PizzaStore;
import top.dzou.factory_patterns.factory_method_pattern.pizza.*;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:31
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(PizzaEnum type) {
        if(type.equals(PizzaEnum.CHEESE)){
            return new NYCheesePizza();
        }else if(type.equals(PizzaEnum.CLAM)){
            return new NYClamPizza();
        }else if(type.equals(PizzaEnum.VEGGIE)){
            return new NYVeggiePizza();
        }
        return null;
    }
}
