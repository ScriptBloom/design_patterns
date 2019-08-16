package top.dzou.prototype_pattern.deep_clone;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;

/**
 * @author dingxiang
 * @date 19-8-16 下午1:08
 */

/**
 * 深拷贝绵羊，让它的颜色Color拷贝时创建新的引用
 */
@Data
@AllArgsConstructor
public class DeepCloneSheep implements Serializable,Cloneable {
    private Color color;//保存引用 非基本类型
    private String name;//String类型
    private String age;

    /**
     * 深克隆方法一 修改clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloneSheep sheep = null;
        sheep = (DeepCloneSheep) super.clone();//sheep先克隆
        sheep.color = (Color) color.clone();//其中非基本类型再克隆
        return sheep;
    }

    /**
     * 方法2.使用序列化
     * @return
     */
    public Object deepClone(){
        Object o = null;
        ByteArrayOutputStream bos;
        ObjectOutputStream oos;
        ByteArrayInputStream bis;
        ObjectInputStream ois;
        try{
            //序列化 对象流
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            o = ois.readObject();
            bos.close();
            bis.close();
            ois.close();
            bis.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public String toString() {
        return "DeepCloneSheep{" +
                "color=" + color.getColor() +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
