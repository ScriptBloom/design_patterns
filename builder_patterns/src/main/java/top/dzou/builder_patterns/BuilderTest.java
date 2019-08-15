package top.dzou.builder_patterns;

/**
 * @author dingxiang
 * @date 19-8-15 上午10:48
 */
public class BuilderTest {
    public static void main(String[] args) {
        AbstractBuilder vacationBuilder = new VacationBuilder();
        vacationBuilder.addHotel("名宿");
        vacationBuilder.addReservation("预定两天");
        vacationBuilder.addSpecialEvent("逛游乐园，游玩海底世界，蹦极");
        vacationBuilder.addTickets("两天后回昆明的票");
        vacationBuilder.buildDay("明天上午10点到");
        Planner plan = vacationBuilder.getVacationPlanner();
        System.out.println(plan);
    }
}
