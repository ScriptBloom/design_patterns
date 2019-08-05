package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:11
 */

/**
 * 星巴克饮品抽象类
 */
public abstract class Beverage {
    //规格
    protected Size size = Size.UNKNOWN;
    public Size getSize(){return size;}
    public void setSize(Size size){
        this.size = size;
    }
    //描述
    protected String description = "unKnown Beverage";
    public String getDescription(){
        return description;
    }
    //价格
    public abstract double cost();
}
