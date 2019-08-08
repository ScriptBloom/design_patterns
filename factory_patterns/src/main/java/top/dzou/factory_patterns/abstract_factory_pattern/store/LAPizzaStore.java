package top.dzou.factory_patterns.abstract_factory_pattern.store;

import top.dzou.factory_patterns.abstract_factory_pattern.Pizza;
import top.dzou.factory_patterns.abstract_factory_pattern.PizzaEnum;
import top.dzou.factory_patterns.abstract_factory_pattern.PizzaIngredientFactory;
import top.dzou.factory_patterns.abstract_factory_pattern.PizzaStore;
import top.dzou.factory_patterns.abstract_factory_pattern.ingredient_factory.LAPizzaIngredientFactory;
import top.dzou.factory_patterns.abstract_factory_pattern.pizza.LACheesePizza;
import top.dzou.factory_patterns.abstract_factory_pattern.pizza.LAClamPizza;
import top.dzou.factory_patterns.abstract_factory_pattern.pizza.LAVeggiePizza;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:33
 */
public class LAPizzaStore extends PizzaStore {
    private PizzaIngredientFactory ingredientFactory;
    public LAPizzaStore(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    protected Pizza createPizza(PizzaEnum type) {
        if(type.equals(PizzaEnum.CHEESE)){
            return new LACheesePizza(ingredientFactory);
        }else if(type.equals(PizzaEnum.CLAM)){
            return new LAClamPizza(ingredientFactory);
        }else if(type.equals(PizzaEnum.VEGGIE)){
            return new LAVeggiePizza(ingredientFactory);
        }
        return null;
    }
}
