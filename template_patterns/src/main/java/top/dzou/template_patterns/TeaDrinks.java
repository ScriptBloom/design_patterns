package top.dzou.template_patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dingxiang
 * @date 19-8-10 下午6:21
 */
public class TeaDrinks extends Drinks{
    protected void pourCup() {
        System.out.println("步骤二：添加茶叶冲泡");
    }

    protected void addCondiments() {
        System.out.println("步骤四：放入少量的柠檬");
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
