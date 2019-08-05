package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:14
 */

/**
 * 装饰者-豆浆
 */
public class Soy extends CondimentDecorator{
    private Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost() {
        return beverage.cost()+5.00;
    }
    public String getDescription() {
        return beverage.getDescription()+" with Soy";
    }
}
