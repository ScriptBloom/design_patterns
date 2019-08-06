package top.dzou.factory_patterns.abstract_factory_pattern;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:15
 */

/**
 * 抽象pizza商店
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(top.dzou.factory_patterns.abstract_factory_pattern.PizzaEnum pizzaEnum);

    public top.dzou.factory_patterns.abstract_factory_pattern.Pizza orderPizza(PizzaEnum pizzaEnum){
        top.dzou.factory_patterns.abstract_factory_pattern.Pizza pizza = createPizza(pizzaEnum);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
