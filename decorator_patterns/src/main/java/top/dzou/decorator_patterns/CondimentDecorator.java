package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:12
 */

/**
 * 原料装饰者抽象类
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
