package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:13
 */

/**
 * 装饰者-摩卡
 */
public class Mocha extends CondimentDecorator{
    private Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost() {
        return beverage.cost()+7.00;
    }

    public String getDescription() {
        return beverage.getDescription()+" with Mocha";
    }
}
