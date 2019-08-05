package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:34
 */

/**
 * 规格
 * 小杯+0.1
 * 中杯+0.15
 * 大杯+0.2
 */
public enum Size {
    SMALL(0.10)
    ,MEDIUM(0.15)
    ,BIG(0.20)
    ,UNKNOWN(0);

    private double cost;

    Size(double v) {
        cost = v;
    }

    public double getCost(){return cost;}
}
