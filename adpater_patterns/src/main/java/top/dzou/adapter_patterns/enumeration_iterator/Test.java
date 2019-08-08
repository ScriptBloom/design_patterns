package top.dzou.adapter_patterns.enumeration_iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author dingxiang
 * @date 19-8-8 上午11:33
 */

/**
 * 测试Enumeration适配Iterator
 */
public class Test {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<>();
        vector.add(12.21);
        vector.add(10.26);
        EnumerationIteratorAdapter enumerationIteratorAdapter = new EnumerationIteratorAdapter(vector.elements());
        double a;
        while (enumerationIteratorAdapter.hasNext()){
            a = (double) enumerationIteratorAdapter.next();
            System.out.println(a);
        }
    }
}
