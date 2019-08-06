package top.dzou.factory_patterns.factory_method_pattern;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:15
 */

/**
 * 抽象pizza商店
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(PizzaEnum pizzaEnum);

    public Pizza orderPizza(PizzaEnum pizzaEnum){
        Pizza pizza = createPizza(pizzaEnum);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
