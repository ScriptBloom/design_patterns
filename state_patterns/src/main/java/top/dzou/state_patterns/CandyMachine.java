package top.dzou.state_patterns;

import lombok.Data;

/**
 * @author dingxiang
 * @date 19-8-12 上午11:11
 */
@Data
public class CandyMachine {
    private State noMoneyState;
    private State hasMoneyState;
    private State soldSate;
    private State soldOutSate;
    //糖果数量
    private int count;
    private State currentState;

    public CandyMachine(int initCandyCount) {
        count = initCandyCount;
        noMoneyState = new NoMoney(this);
        hasMoneyState = new HasMoney(this);
        soldSate = new Sold(this);
        soldOutSate = new SoldOut(this);
        currentState = noMoneyState;
    }
    public void purchaseOneCandy(){
        currentState.insertMoney();
        currentState.turnCrank();
        currentState.distribute();
    }
}
