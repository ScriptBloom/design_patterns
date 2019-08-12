package top.dzou.state_patterns;

/**
 * @author dingxiang
 * @date 19-8-12 上午10:49
 */
public class SoldOut extends State{
    private CandyMachine candyMachine;
    public SoldOut(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    protected void returnMoney() {
        System.out.println("您好，不好意思，这里是给您退的15分-------");
        candyMachine.setCurrentState(candyMachine.getNoMoneyState());
    }
}
