package top.dzou.prototype_pattern.deep_clone;

import org.junit.Test;

/**
 * @author dingxiang
 * @date 19-8-16 下午1:14
 */
public class ClientTest {
    @Test
    public void testCloneMethod1() throws CloneNotSupportedException {
        Color color = new Color("white");
        DeepCloneSheep sheep = new DeepCloneSheep(color,"小白","12");
        DeepCloneSheep cloneSheep1 = (DeepCloneSheep) sheep.clone();
        DeepCloneSheep cloneSheep2 = (DeepCloneSheep) sheep.clone();
        System.out.println("sheep:"+sheep);
        System.out.println("cloneSheep1:"+cloneSheep1);
        System.out.println("cloneSheep2:"+cloneSheep2+"\n");
        System.out.println("方法一：修改clone方法");
        System.out.println("cloneSheep1是否等于sheep："+ (cloneSheep1 == sheep));
        System.out.println("cloneSheep1是否等于cloneSheep2："+ (cloneSheep1 == cloneSheep2)+"\n");
        System.out.println("sheep中非基本类型Color是否与cloneSheep1中Color相等："+(sheep.getColor()==cloneSheep1.getColor()));
        System.out.println("cloneSheep2中非基本类型Color是否与cloneSheep1中Color相等："+(cloneSheep2.getColor()==cloneSheep1.getColor())+"\n");
    }

    @Test
    public void testCloneMethod2(){
        Color color = new Color("white");
        DeepCloneSheep sheep = new DeepCloneSheep(color,"小白","12");
        DeepCloneSheep cloneSheep3 = (DeepCloneSheep) sheep.deepClone();
        DeepCloneSheep cloneSheep4 = (DeepCloneSheep) sheep.deepClone();
        System.out.println("sheep:"+sheep);
        System.out.println("cloneSheep3:"+cloneSheep3);
        System.out.println("cloneSheep4:"+cloneSheep4+"\n");
        System.out.println("方法二：序列化方法");
        System.out.println("cloneSheep3是否等于sheep："+ (cloneSheep3 == sheep));
        System.out.println("cloneSheep3是否等于cloneSheep4："+ (cloneSheep3 == cloneSheep4)+"\n");
        System.out.println("sheep中非基本类型Color是否与cloneSheep3中Color相等："+(sheep.getColor()==cloneSheep3.getColor()));
        System.out.println("cloneSheep3中非基本类型Color是否与cloneSheep4中Color相等："+(cloneSheep3.getColor()==cloneSheep4.getColor()));
    }
}
