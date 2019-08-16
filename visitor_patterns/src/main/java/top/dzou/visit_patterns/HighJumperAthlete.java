package top.dzou.visit_patterns;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author dingxiang
 * @date 19-8-16 下午6:18
 */

/**
 * 跳高运动员元素类
 */
@Data
@AllArgsConstructor
public class HighJumperAthlete implements Element {
    private String name;//名字
    private String highJumpGrade;//成绩
    private HealthState healthCondition;//健康状态
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
