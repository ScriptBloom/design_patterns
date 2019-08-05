package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:14
 */

/**
 * 装饰者-奶泡
 */
public class Whip extends CondimentDecorator{
    private Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost() {
        return beverage.cost()+15.00;
    }
    public String getDescription() {
        return beverage.getDescription()+" with Whip";
    }
}
