package top.dzou.state_patterns;

/**
 * @author dingxiang
 * @date 19-8-12 上午10:49
 */
public class Sold extends State{
    private CandyMachine candyMachine;
    public Sold(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    protected void distribute() {
        if(candyMachine.getCount()>0){
            System.out.println("您好，这里是一个糖果-------");
            candyMachine.setCount((candyMachine.getCount()-1));
            candyMachine.setCurrentState(candyMachine.getNoMoneyState());
        }else {
            System.out.println("您好，不好意思，我们的糖果售空了，稍后将退钱给你-------");
            candyMachine.setCurrentState(candyMachine.getSoldOutSate());
            candyMachine.getCurrentState().returnMoney();
        }
    }
}
