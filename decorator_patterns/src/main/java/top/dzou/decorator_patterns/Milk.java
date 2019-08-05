package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:13
 */

/**
 * 装饰者-牛奶
 */
public class Milk extends CondimentDecorator{
    private Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost() {
        return beverage.cost()+9.00;
    }

    public void setSize() {

    }

    public String getDescription() {
        return beverage.getDescription()+" with Milk";
    }
}
