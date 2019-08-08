package top.dzou.adapter_patterns.enumeration_iterator;

import java.util.ArrayList;

/**
 * @author dingxiang
 * @date 19-8-8 上午11:39
 */

/**
 * 测试Iterator适配Enumeration
 */
public class TestIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        IteratorEnumerationAdapter iteratorEnumerationAdapter = new IteratorEnumerationAdapter(list.iterator());
        String a = "";
        while (iteratorEnumerationAdapter.hasMoreElements()){
            a = (String) iteratorEnumerationAdapter.nextElement();
            System.out.println(a);
        }

    }
}
