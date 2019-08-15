package top.dzou.flyweight_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 下午1:45
 */

/**
 * 棋子方法接口
 */
public interface FlyWeight {
    public void display(int x,int y);
    public Color getColor();
    public void setColor(Color color);
}
