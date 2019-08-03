package top.dzou.strategy_mode;

/**
 * @author dingxiang
 * @date 19-8-3 上午11:55
 */

/**
 * 抽象的程序员类
 */
public abstract class Programmer {
    //programBehavior接口
    protected ProgramBehavior programBehavior;
    //设置coding behavior
    protected void setProgramBehavior(ProgramBehavior programBehavior){
        this.programBehavior = programBehavior;
    }
    //喝水
    protected void doDrinking(){
        System.out.println("I am drinking.");
    }
    //写代码
    protected void doCoding(){
        programBehavior.doCoding();
    }
    //睡觉
    protected void doSleeping(){
        System.out.println("I am sleeping");
    }
}
