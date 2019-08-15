package top.dzou.bridge_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 上午10:39
 */
public class BridgeClient {
    public static void main(String[] args) {
        Spicy noSpicy = new WithSpicy();
        Dumplings dumplings = new Dumplings();
        dumplings.setSpicy(noSpicy);
        dumplings.orderLaunch();
        System.out.println("\n");
        Noodle noodle = new Noodle();
        noodle.setSpicy(noSpicy);
        noodle.orderLaunch();
        System.out.println("\n");
        Spicy withSpicy = new WithSpicy();
        RiceNoodle riceNoodle = new RiceNoodle();
        riceNoodle.setSpicy(withSpicy);
        riceNoodle.orderLaunch();
    }
}
