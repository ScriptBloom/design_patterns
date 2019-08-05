package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:12
 */

/**
 * 混合咖啡
 */
public class HouseBlend extends Beverage{
    public HouseBlend(Size size){
        setSize(size);
        if(this.size==Size.UNKNOWN){
            throw new RuntimeException();
        }
        description = "HouseBlend "+this.size.name();
    }
    public double cost() {
        return 50.00+size.getCost();
    }
}
