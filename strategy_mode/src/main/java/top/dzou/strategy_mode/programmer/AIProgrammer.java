package top.dzou.strategy_mode.programmer;

import top.dzou.strategy_mode.Programmer;
import top.dzou.strategy_mode.behavior.AIBehavior;

/**
 * @author dingxiang
 * @date 19-8-3 下午12:06
 */
public class AIProgrammer extends Programmer {
    public AIProgrammer(){
        programBehavior = new AIBehavior();
    }
}
