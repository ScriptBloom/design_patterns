package top.dzou.adapter_patterns.enumeration_iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author dingxiang
 * @date 19-8-8 上午11:37
 */

/**
 * Iterator适配成Enumeration
 */
public class IteratorEnumerationAdapter implements Enumeration {
    private Iterator iterator;
    public IteratorEnumerationAdapter(Iterator iterator){
        this.iterator = iterator;
    }
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
}
