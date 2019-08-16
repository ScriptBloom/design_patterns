package top.dzou.prototype_pattern.shallow_clone;

/**
 * @author dingxiang
 * @date 19-8-16 下午1:04
 */
public class ClientTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Color color = new Color("white");
        Sheep sheep = new Sheep(color,"小白","12");
        Sheep cloneSheep1 = (Sheep) sheep.clone();
        Sheep cloneSheep2 = (Sheep) sheep.clone();
        System.out.println("sheep:"+sheep);
        System.out.println("cloneSheep1:"+cloneSheep1);
        System.out.println("cloneSheep2:"+cloneSheep2);
        System.out.println("\n");
        System.out.println("cloneSheep1是否等于sheep："+ (cloneSheep1 == sheep));
        System.out.println("cloneSheep1是否等于cloneSheep2："+ (cloneSheep1 == cloneSheep2));
        System.out.println("\n");
        System.out.println("sheep中非基本类型Color是否与cloneSheep1中Color相等："+(sheep.getColor()==cloneSheep1.getColor()));
        System.out.println("cloneSheep2中非基本类型Color是否与cloneSheep1中Color相等："+(cloneSheep2.getColor()==cloneSheep1.getColor()));
    }
}
