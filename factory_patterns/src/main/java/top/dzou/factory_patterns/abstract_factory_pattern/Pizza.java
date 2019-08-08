package top.dzou.factory_patterns.abstract_factory_pattern;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:59
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    public abstract void prepare();
    public void bake() {
        System.out.println("I am baking");
    }

    public void cut() {
        System.out.println("I am cutting");
    }

    public void box() {
        System.out.println("I am boxing");
    }
}
