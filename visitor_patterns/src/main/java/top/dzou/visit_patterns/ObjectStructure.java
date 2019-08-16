package top.dzou.visit_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingxiang
 * @date 19-8-16 下午6:27
 */

/**
 * 元素访问入口，元素结构容器
 */
public class ObjectStructure {
    //list存放运动员元素
    private List<Element> athletes;
    public ObjectStructure(){
        athletes = new ArrayList<>();
    }
    //添加运动员
    public void add(Element element){
        athletes.add(element);
    }
    //访问所有运动员
    public void visitAll(Visitor visitor){
        athletes.forEach((o)->o.accept(visitor));
    }
}
