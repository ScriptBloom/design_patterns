package top.dzou.state_patterns;

/**
 * @author dingxiang
 * @date 19-8-12 上午10:48
 */
public class NoMoney extends State{
    private CandyMachine candyMachine;
    public NoMoney(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    protected void insertMoney() {
        System.out.println("你放入了15分,请你转动轮盘来获取糖果-------");
        candyMachine.setCurrentState(candyMachine.getHasMoneyState());
    }
}
