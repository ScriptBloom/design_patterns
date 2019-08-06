package top.dzou.factory_patterns.simple_factory;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:16
 */

/**
 * pizza简单工厂
 */
public class SimplePizzaFactory {

    public Pizza createPizza(PizzaEnum type){
        Pizza pizza = null;
        if(type.equals(PizzaEnum.CHEESE)){
            pizza = new CheesePizza();
        }else if(type.equals(PizzaEnum.CLAM)){
            pizza = new ClamPizza();
        }else if(type.equals(PizzaEnum.VEGGIE)){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
