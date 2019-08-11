package top.dzou.template_patterns;

import java.util.Arrays;

/**
 * @author dingxiang
 * @date 19-8-10 下午6:23
 */
public class TestMain {
    public static void main(String[] args) {
        CoffeeDrinks coffeeDrinks = new CoffeeDrinks();
        TeaDrinks teaDrinks = new TeaDrinks();
        coffeeDrinks.prepareDrinks();
        System.out.println("\n");
        teaDrinks.prepareDrinks();
        int[] a = {1,2,3};
    }
}
