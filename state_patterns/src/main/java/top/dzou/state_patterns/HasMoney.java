package top.dzou.state_patterns;

/**
 * @author dingxiang
 * @date 19-8-12 上午10:49
 */
public class HasMoney extends State{
    private CandyMachine candyMachine;
    public HasMoney(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    protected void insertMoney() {
        System.out.println("已经放入15分了。请不要再次放入");
    }
    protected void turnCrank() {
        System.out.println("你转动了轮盘，等待糖果放出-------");
        candyMachine.setCurrentState(candyMachine.getSoldSate());
    }
}
