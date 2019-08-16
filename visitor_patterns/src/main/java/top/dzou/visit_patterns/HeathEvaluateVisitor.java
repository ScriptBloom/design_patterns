package top.dzou.visit_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 下午6:21
 */

/**
 * 访问运动员身体健康状态
 * 执行相应操作提醒实现类
 */
public class HeathEvaluateVisitor implements Visitor {
    public void visit(HighJumperAthlete athlete) {
        HealthState state = athlete.getHealthCondition();
        healthEvaluate(athlete.getName(),state);
    }

    public void visit(LongJumperAthlete athlete) {
        HealthState state = athlete.getHealthCondition();
        healthEvaluate(athlete.getName(),state);
    }

    public void visit(RunnerAthlete athlete) {
        HealthState state = athlete.getHealthCondition();
        healthEvaluate(athlete.getName(),state);
    }

    public static void healthEvaluate(String name,HealthState state){
        if(state.equals(HealthState.MORE_BETTER)){
            System.out.println(name+" 你的身体状态非常好");
        }else if(state.equals(HealthState.GOOD)){
            System.out.println(name+" 你的身体状况挺好，继续保持");
        }else if(state.equals(HealthState.NORMAL)){
            System.out.println(name+" 你的身体状况没问题，不过要加以注意");
        }else if(state.equals(HealthState.A_LITTLE_BAD)){
            System.out.println(name+" 你的身体状况出了些问题，请作进一步检查");
        }else{
            System.out.println(name+" 你的身体状况很不好，你将不能继续训练，请立即进行检查");
        }
    }
}
