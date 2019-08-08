package top.dzou.factory_patterns.simple_factory;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:15
 */

/**
 * pizza商店
 */
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;
    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(PizzaEnum pizzaEnum){
        Pizza pizza;
        pizza = simplePizzaFactory.createPizza(pizzaEnum);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
