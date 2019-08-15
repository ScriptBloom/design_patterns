package top.dzou.bridge_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 上午10:32
 */
public class Dumplings extends Launch{
    private Spicy spicy;
    public void orderLaunch() {
        System.out.println(spicy.addSpicy()+" 饺子");
    }

    public void setSpicy(Spicy spicy) {
        this.spicy = spicy;
    }
}
