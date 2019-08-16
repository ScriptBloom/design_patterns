package top.dzou.visit_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 下午6:15
 */
public class ClientTest {
    public static void main(String[] args) {
        ObjectStructure objectStructure = addAndGetAthlete();
        GradeSelectionsVisitor visitor = new GradeSelectionsVisitor();
        System.out.println("比赛最终结果------");
        objectStructure.visitAll(visitor);
        System.out.println("\n身体健康检查结果------");
        HeathEvaluateVisitor visitor1 = new HeathEvaluateVisitor();
        objectStructure.visitAll(visitor1);
    }

    /**
     * 添加运动员
     * @return 操作运动员的数据结构
     */
    private static ObjectStructure addAndGetAthlete(){
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new HighJumperAthlete("张三","8.00",HealthState.A_LITTLE_BAD));
        objectStructure.add(new HighJumperAthlete("李四","6.00",HealthState.GOOD));
        objectStructure.add(new HighJumperAthlete("王五","7.00",HealthState.NORMAL));
        objectStructure.add(new LongJumperAthlete("小白","13.00",HealthState.MORE_BETTER));
        objectStructure.add(new LongJumperAthlete("小丁","10",HealthState.BAD));
        objectStructure.add(new LongJumperAthlete("小周","11.00",HealthState.NORMAL));
        objectStructure.add(new RunnerAthlete("小吴","46","11",HealthState.NORMAL));
        objectStructure.add(new RunnerAthlete("小王","44","13",HealthState.GOOD));
        objectStructure.add(new RunnerAthlete("小邹","45","10",HealthState.A_LITTLE_BAD));
        objectStructure.add(new RunnerAthlete("小赵","43","11.5",HealthState.BAD));
        return objectStructure;
    }
}
