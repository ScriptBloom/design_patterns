package top.dzou.flyweight_patterns;

import java.util.Random;

/**
 * @author dingxiang
 * @date 19-8-15 下午1:54
 */
public class ChessGameTest {
    public static void main(String[] args) {
        Random random = new Random();
        ChessFlyweightFactory flyweightFactory = new ChessFlyweightFactory();
        ChessFlyWeight chess1 = (ChessFlyWeight) flyweightFactory.getFlyweight(Color.BLACK);
        chess1.display(random.nextInt(361),random.nextInt(361));

        ChessFlyWeight chess2 = (ChessFlyWeight) flyweightFactory.getFlyweight(Color.WHITE);
        chess2.display(random.nextInt(361),random.nextInt(361));
    }
}
