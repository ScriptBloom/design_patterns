package top.dzou.factory_patterns.abstract_factory_pattern.ingredient_factory;

import top.dzou.factory_patterns.abstract_factory_pattern.Dough;
import top.dzou.factory_patterns.abstract_factory_pattern.PizzaIngredientFactory;
import top.dzou.factory_patterns.abstract_factory_pattern.Sauce;
import top.dzou.factory_patterns.abstract_factory_pattern.ingredient.NYDough;
import top.dzou.factory_patterns.abstract_factory_pattern.ingredient.NYSauce;

/**
 * @author dingxiang
 * @date 19-8-6 上午11:02
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        System.out.println("add NY dough");
        return new NYDough();
    }

    public Sauce createSauce() {
        System.out.println("add NY sauce");
        return new NYSauce();
    }
}
