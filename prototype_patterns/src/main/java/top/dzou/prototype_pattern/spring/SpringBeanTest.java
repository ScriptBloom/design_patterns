package top.dzou.prototype_pattern.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dingxiang
 * @date 19-8-16 下午2:51
 */
public class SpringBeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object bean = context.getBean("bean");//获取该bean
        Object bean2 = context.getBean("bean");//再获取一个
        //打印是否相等，测试原型模式
        //调用BeanFactory中 doGetBean方法 其中判断是否为if (mbd.isPrototype())，是的话就创建原型模式的Bean
        System.out.println("bean是否等于bean2："+(bean==bean2));
    }
}
