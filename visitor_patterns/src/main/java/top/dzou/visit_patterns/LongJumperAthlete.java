package top.dzou.visit_patterns;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author dingxiang
 * @date 19-8-16 下午6:18
 */
/**
 * 跳远运动员元素类
 */
@Data
@AllArgsConstructor
public class LongJumperAthlete implements Element{
    private String name;
    private String longJumpGrade;
    private HealthState healthCondition;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
