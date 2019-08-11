package top.dzou.composite_patterns;

/**
 * @author dingxiang
 * @date 19-8-11 上午11:49
 */
public class Waitress {
    private MenuComponent allMenus;
    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
}
