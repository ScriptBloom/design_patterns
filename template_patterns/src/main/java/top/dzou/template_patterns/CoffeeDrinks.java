package top.dzou.template_patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author dingxiang
 * @date 19-8-10 下午6:20
 */
public class CoffeeDrinks extends Drinks{
    protected void pourCup() {
        System.out.println("步骤二：倒入咖啡粉冲泡");
    }

    protected void addCondiments() {
        System.out.println("步骤四：添加牛奶、摩卡和奶泡");
    }

    @Override
    protected boolean wantCondiments() {
        try {
            char want = getUserInput();
            return want == 'y';
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.wantCondiments();
    }

    private char getUserInput() throws IOException {
        System.out.println("请输入你是否需要添加原料(y/n):");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return  (char) in.read();
    }
}
