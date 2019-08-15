package top.dzou.builder_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 上午11:01
 */
public abstract class AbstractBuilder {
    public abstract void buildDay(String day);
    public abstract void addHotel(String hotel);
    public abstract void addReservation(String reservation);
    public abstract void addSpecialEvent(String specialEvent);
    public abstract void addTickets(String ticket);
    public abstract Planner getVacationPlanner();
}
