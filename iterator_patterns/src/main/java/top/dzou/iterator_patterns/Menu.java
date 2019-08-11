package top.dzou.iterator_patterns;

/**
 * @author dingxiang
 * @date 19-8-11 上午10:35
 */
public interface Menu {
    public void addItem(String name,String price,String des);
    public Iterator createIterator();
}
