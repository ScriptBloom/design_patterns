package top.dzou.iterator_patterns;

/**
 * @author dingxiang
 * @date 19-8-11 上午10:40
 */
public class Waitress {
    private Menu cakeMenu;
    private Menu coffeeMenu;
    private Menu dinnerMenu;
    public Waitress(Menu cakeMenu,Menu coffeeMenu,Menu dinnerMenu){
        this.cakeMenu = cakeMenu;
        this.coffeeMenu = coffeeMenu;
        this.dinnerMenu = dinnerMenu;
    }
    public void printMenu(){
        Iterator cakeI = cakeMenu.createIterator();
        Iterator coffeeI = coffeeMenu.createIterator();
        Iterator dinnerI = dinnerMenu.createIterator();
        System.out.println("Menu is here:");
        System.out.println("Cake:");
        printMenu(cakeI);
        System.out.println("Coffee:");
        printMenu(coffeeI);
        System.out.println("Dinner:");
        printMenu(dinnerI);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }
    }
}
