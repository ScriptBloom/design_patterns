package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:13
 */

/**
 *浓缩咖啡
 */
public class Espresso extends Beverage{
    public Espresso(Size size){
        setSize(size);
        if(this.size==Size.UNKNOWN){
            throw new RuntimeException();
        }
        description = "Espresso "+this.size.name();
    }
    public double cost() {
        return 25.00+size.getCost();
    }
}
