package top.dzou.builder_patterns;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author dingxiang
 * @date 19-8-15 上午11:01
 */
@AllArgsConstructor
@Data
public class Planner {
    private String hotel;
    private String day;
    private String ticket;
    private String reservation;
    private String specialEvent;

    @Override
    public String toString() {
        return "Planner：\n" +
                "hotel:" + hotel + '\n' +
                "day:" + day + '\n' +
                "ticket:" + ticket + '\n' +
                "reservation:" + reservation + '\n' +
                "specialEvent:" + specialEvent + '\n';
    }
}
