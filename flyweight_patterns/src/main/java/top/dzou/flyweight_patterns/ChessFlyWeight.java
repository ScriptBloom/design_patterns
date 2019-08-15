package top.dzou.flyweight_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 下午1:43
 */

/**
 * 棋子实现类
 */
public class ChessFlyWeight implements FlyWeight{
    //内部状态，可共享
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    //外部状态作为参数传入
    public void display(int x, int y) {
        System.out.println("you put a "+getColor().name().toLowerCase()+" chess at "+"("+x+","+y+")");
    }
}
