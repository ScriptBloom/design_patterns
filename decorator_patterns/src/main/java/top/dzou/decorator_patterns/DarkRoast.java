package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:13
 */

/**
 * 深培咖啡
 */
public class DarkRoast extends Beverage{
    public DarkRoast(Size size){
        setSize(size);
        if(this.size==Size.UNKNOWN){
            throw new RuntimeException();
        }
        description = "DarkRoast "+this.size.name();
    }

    public double cost() {
        return 30.00+size.getCost();
    }
}
