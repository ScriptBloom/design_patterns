package top.dzou.factory_patterns.abstract_factory_pattern;

/**
 * @author dingxiang
 * @date 19-8-6 上午11:01
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
}
