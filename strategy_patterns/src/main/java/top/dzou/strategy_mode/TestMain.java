package top.dzou.strategy_mode;

import org.junit.Test;
import top.dzou.strategy_mode.behavior.RetireBehavior;
import top.dzou.strategy_mode.programmer.AIProgrammer;
import top.dzou.strategy_mode.programmer.BigDataProgrammer;
import top.dzou.strategy_mode.programmer.JavaWebProgrammer;

/**
 * @author dingxiang
 * @date 19-8-3 下午12:05
 */
public class TestMain {
    @Test
    public void testAI() throws InterruptedException {
        Programmer aiProgrammer = new AIProgrammer();
        aiProgrammer.doDrinking();
        aiProgrammer.doCoding();
        aiProgrammer.doSleeping();
        Thread.sleep(2000);
        System.out.println("20年过去了");
        aiProgrammer.setProgramBehavior(new RetireBehavior());
        aiProgrammer.doCoding();
    }
    @Test
    public void testJava() throws InterruptedException {
        Programmer javaWebProgrammer = new JavaWebProgrammer();
        javaWebProgrammer.doDrinking();
        javaWebProgrammer.doCoding();
        javaWebProgrammer.doSleeping();
        Thread.sleep(2000);
        System.out.println("20年过去了");
        javaWebProgrammer.setProgramBehavior(new RetireBehavior());
        javaWebProgrammer.doCoding();
    }
    @Test
    public void testBigData() throws InterruptedException {
        Programmer bigDataProgrammer = new BigDataProgrammer();
        bigDataProgrammer.doDrinking();
        bigDataProgrammer.doCoding();
        bigDataProgrammer.doSleeping();
        Thread.sleep(2000);
        System.out.println("20年过去了");
        bigDataProgrammer.setProgramBehavior(new RetireBehavior());
        bigDataProgrammer.doCoding();
    }
}
