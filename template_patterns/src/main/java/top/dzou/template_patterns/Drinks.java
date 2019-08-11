package top.dzou.template_patterns;

/**
 * @author dingxiang
 * @date 19-8-10 下午6:16
 */
public abstract class Drinks {
    /**
     * 这就是模板方法 里面调用了相关的算法（自己实现的和抽象的由子类实现的）
     */
    final void prepareDrinks(){
        //烧水
        boilWater();
        //冲泡
        pourCup();
        //等待
        waitForWhile();
        //添加原料
        //wantCondiments是挂钩
        if(wantCondiments()) {
            addCondiments();
        }
    }

    /**
     * 这是一个钩子hook，里面的实现是默认的，可以由子类继承更改具体实现，表明是可选的部分
     */
    protected boolean wantCondiments() {
        return true;
    }

    private void boilWater(){
        System.out.println("步骤一：正在烧水");
    }

    protected abstract void pourCup();

    protected abstract void addCondiments();

    private void waitForWhile(){
        System.out.println("步骤三：等待5分钟");
    }

}
