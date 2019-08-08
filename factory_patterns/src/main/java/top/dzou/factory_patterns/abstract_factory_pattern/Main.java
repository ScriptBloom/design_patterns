package top.dzou.factory_patterns.abstract_factory_pattern;

import top.dzou.factory_patterns.abstract_factory_pattern.ingredient_factory.LAPizzaIngredientFactory;
import top.dzou.factory_patterns.abstract_factory_pattern.ingredient_factory.NYPizzaIngredientFactory;
import top.dzou.factory_patterns.abstract_factory_pattern.store.LAPizzaStore;

/**
 * @author dingxiang
 * @date 19-8-6 上午11:10
 */
public class Main {
    public static void main(String[] args) {
        PizzaIngredientFactory laPizzaIngredientFactory = new LAPizzaIngredientFactory();
        LAPizzaStore laPizzaStore = new LAPizzaStore(laPizzaIngredientFactory);
        laPizzaStore.orderPizza(PizzaEnum.CHEESE);
    }
}
