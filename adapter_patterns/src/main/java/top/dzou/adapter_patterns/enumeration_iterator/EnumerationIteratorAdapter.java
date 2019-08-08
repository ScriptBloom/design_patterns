package top.dzou.adapter_patterns.enumeration_iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author dingxiang
 * @date 19-8-8 上午11:31
 */

/**
 * Enumeration适配Iterator
 */
public class EnumerationIteratorAdapter implements Iterator {
    private Enumeration enumeration;

    public EnumerationIteratorAdapter(Enumeration enumeration){
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
