package top.dzou.factory_patterns.abstract_factory_pattern.ingredient_factory;

import top.dzou.factory_patterns.abstract_factory_pattern.Dough;
import top.dzou.factory_patterns.abstract_factory_pattern.PizzaIngredientFactory;
import top.dzou.factory_patterns.abstract_factory_pattern.Sauce;
import top.dzou.factory_patterns.abstract_factory_pattern.ingredient.LADough;
import top.dzou.factory_patterns.abstract_factory_pattern.ingredient.LASauce;

/**
 * @author dingxiang
 * @date 19-8-6 上午11:03
 */
public class LAPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        System.out.println("add LA dough");
        return new LADough();
    }

    public Sauce createSauce() {
        System.out.println("add LA sauce");
        return new LASauce();
    }
}
