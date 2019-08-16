package top.dzou.visit_patterns;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author dingxiang
 * @date 19-8-16 下午6:17
 */
/**
 * 径赛运动员元素类
 */
@Data
@AllArgsConstructor
public class RunnerAthlete implements Element {
    private String name;
    private String longRunGrade;
    private String shortRunGrade;
    private HealthState healthCondition;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
