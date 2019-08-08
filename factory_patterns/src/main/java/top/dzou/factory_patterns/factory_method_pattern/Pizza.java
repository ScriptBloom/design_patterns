package top.dzou.factory_patterns.factory_method_pattern;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:16
 */
public abstract class Pizza {
    protected String name;
    public  void prepare(){
        System.out.println("I am preparing "+name);
    }

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
