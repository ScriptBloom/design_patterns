package top.dzou.visit_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 下午6:14
 */

/**
 * 访问者接口，接口方法访问具体对象，违背依赖倒置原则
 */
public interface Visitor {
    public void visit(HighJumperAthlete athlete);
    public void visit(LongJumperAthlete athlete);
    public void visit(RunnerAthlete athlete);
}
