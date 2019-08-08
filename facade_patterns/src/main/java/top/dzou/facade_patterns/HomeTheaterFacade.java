package top.dzou.facade_patterns;

/**
 * @author dingxiang
 * @date 19-8-8 下午12:14
 */
public class HomeTheaterFacade implements HomeTheaterFacadeAPI{
    private Amplifier amplifier;
    private CDplayer cDplayer;
    private DVDplayer dvDplayer;
    private PopCornPopper popCornPopper;
    private Screen screen;
    private TheaterLight theaterLight;
    private Projector projector;
    public HomeTheaterFacade(Amplifier amplifier,
                             CDplayer cDplayer,
                             DVDplayer dvDplayer,
                             PopCornPopper popCornPopper,
                             Screen screen,
                             TheaterLight theaterLight,
                             Projector projector){
        this.amplifier = amplifier;
        this.cDplayer = cDplayer;
        this.dvDplayer = dvDplayer;
        this.popCornPopper = popCornPopper;
        this.screen = screen;
        this.theaterLight = theaterLight;
        this.projector = projector;
    }

    public void watchMovie() {
        System.out.println("准备开始看电影");
        popCornPopper.on();
        popCornPopper.pop();
        theaterLight.dim(10);
        screen.down();
        projector.open();
        amplifier.on();
        amplifier.setDvdAndCd();
        amplifier.setVolume(20);
        dvDplayer.open();
        cDplayer.open();
    }

    public void endMovie() {
        System.out.println("正在关闭设备");
        popCornPopper.close();
        theaterLight.close();
        screen.up();
        projector.close();
        amplifier.close();
        dvDplayer.close();
        cDplayer.close();
    }
}
