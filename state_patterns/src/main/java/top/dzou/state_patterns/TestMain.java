package top.dzou.state_patterns;

/**
 * @author dingxiang
 * @date 19-8-12 上午11:29
 */
public class TestMain {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(3);
        candyMachine.purchaseOneCandy();
        System.out.println("\n");
        candyMachine.purchaseOneCandy();
        System.out.println("\n");
        candyMachine.purchaseOneCandy();
        System.out.println("\n");
        candyMachine.purchaseOneCandy();
    }
}
