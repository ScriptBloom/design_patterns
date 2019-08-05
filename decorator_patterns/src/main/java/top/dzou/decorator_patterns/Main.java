package top.dzou.decorator_patterns;

/**
 * @author dingxiang
 * @date 19-8-5 上午10:26
 */
public class Main {
    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast(Size.BIG);
        Milk mb = new Milk(darkRoast);
        System.out.println(mb.getDescription()+",cost:"+mb.cost());

        Mocha mochab = new Mocha(new Espresso(Size.SMALL));
        System.out.println(mochab.getDescription()+",cost:"+mochab.cost());

        Soy sb = new Soy(new HouseBlend(Size.MEDIUM));
        System.out.println(sb.getDescription()+",cost:"+sb.cost());

        Whip wb = new Whip(new DarkRoast(Size.BIG));
        System.out.println(wb.getDescription()+",cost:"+sb.cost());

        Milk mb2 = new Milk(mb);
        System.out.println(mb2.getDescription()+",cost:"+mb2.cost());

        Soy soyb = new Soy(mb2);
        System.out.println(soyb.getDescription()+",cost:"+soyb.cost());

        Whip whipb = new Whip(soyb);
        System.out.println(whipb.getDescription()+",cost:"+whipb.cost());
    }
}
