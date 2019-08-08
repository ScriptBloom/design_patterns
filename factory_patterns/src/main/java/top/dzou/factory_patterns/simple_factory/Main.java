package top.dzou.factory_patterns.simple_factory;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:28
 */
public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza(PizzaEnum.CHEESE);
    }
}
