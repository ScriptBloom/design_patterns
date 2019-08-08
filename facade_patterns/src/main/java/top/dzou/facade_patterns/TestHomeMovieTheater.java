package top.dzou.facade_patterns;

/**
 * @author dingxiang
 * @date 19-8-8 下午12:32
 */
public class TestHomeMovieTheater {
    public static void main(String[] args) throws InterruptedException {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(),new CDplayer(),new DVDplayer(),
                new PopCornPopper(),new Screen(),new TheaterLight(),new Projector());
        homeTheaterFacade.watchMovie();
        Thread.sleep(2000);
        homeTheaterFacade.endMovie();
    }
}
