package top.dzou.visit_patterns;

/**
 * @author dingxiang
 * @date 19-8-16 下午6:20
 */

/**
 * 访问运动员成绩获奖信息
 * 根据成绩信息获取获奖情况的实现类
 */
public class GradeSelectionsVisitor implements Visitor{
    //实现访问跳高运动员操作
    public void visit(HighJumperAthlete athlete) {
        double grade = Double.parseDouble(athlete.getHighJumpGrade());
        if(grade>=7.00){
            System.out.println(athlete.getName()+" 获得了跳高一等奖");
        }else if(grade>=6.00){
            System.out.println(athlete.getName()+" 获得了跳高二等奖");
        }else {
            System.out.println("很遗憾，"+athlete.getName()+" 在跳高比赛中没有获得奖");
        }
    }
    //实现访问跳远运动员
    public void visit(LongJumperAthlete athlete) {
        double grade = Double.parseDouble(athlete.getLongJumpGrade());
        if(grade>=12.00){
            System.out.println(athlete.getName()+" 获得了跳远一等奖");
        }else if(grade>=10.00){
            System.out.println(athlete.getName()+" 获得了跳远二等奖");
        }else {
            System.out.println("很遗憾，"+athlete.getName()+" 在跳远比赛中没有获得奖");
        }
    }
    //实现访问径赛运动员
    public void visit(RunnerAthlete athlete) {
        double longRunGrade = Double.parseDouble(athlete.getLongRunGrade());
        double shortRunGrade = Double.parseDouble(athlete.getShortRunGrade());
        if(longRunGrade<=45.00){
            System.out.println(athlete.getName()+" 获得了长跑一等奖");
        }else if(longRunGrade<=53.00){
            System.out.println(athlete.getName()+" 获得了长跑二等奖");
        }else {
            System.out.println("很遗憾，"+athlete.getName()+" 在长跑比赛中没有获得奖");
        }
        if(shortRunGrade<=11.00){
            System.out.println(athlete.getName()+" 获得了短跑一等奖");
        }else if(shortRunGrade<=12.50){
            System.out.println(athlete.getName()+" 获得了短跑二等奖");
        }else {
            System.out.println("很遗憾，"+athlete.getName()+" 在短跑比赛中没有获得奖");
        }
    }
}
