package top.dzou.builder_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 上午11:03
 */
public class VacationBuilder extends AbstractBuilder {
    private String hotel;
    private String day;
    private String ticket;
    private String reservation;
    private String specialEvent;

    public void buildDay(String day) {
        this.day = day;
    }

    public void addHotel(String hotel) {
        this.hotel = hotel;
    }

    public void addReservation(String reservation) {
        this.reservation = reservation;
    }

    public void addSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }

    public void addTickets(String ticket) {
        this.ticket = ticket;
    }

    public Planner getVacationPlanner() {
        return new Planner(hotel,day,ticket,reservation,specialEvent);
    }
}
