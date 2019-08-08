package top.dzou.facade_patterns;

/**
 * @author dingxiang
 * @date 19-8-8 下午12:17
 */

/**
 * 灯光
 */
public class TheaterLight {
    public void dim(int i){
        System.out.println("灯光模式"+i+"开启");
    }
    public void close(){
        System.out.println("关闭灯光");
    }
}
