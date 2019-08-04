package top.zou.observer_patterns;

/**
 * @author dingxiang
 * @date 19-8-4 上午10:41
 */

/**
 * 观察者
 */
public class CurrentConditionDisplay implements Observer,Displayable{
    //可用于观察者对主题对象取消订阅
    private Subject subject;
    private WeatherArgs weatherArgs;
    //创建时注册
    public CurrentConditionDisplay(Subject s){
        s.registerObserver(this);
        subject = s;
    }
    @Override
    public void update(Subject subject, Object args) {
        if(subject instanceof WeatherData){
            weatherArgs = (WeatherArgs) args;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("template:"+weatherArgs.getTemplate()+", humidity:"+weatherArgs.getHumidity()+", pressure:"+weatherArgs.getPressure());
    }

    //观察者取消订阅 通知主题对象删除我
    private void removeMe(){
        subject.removeObserver(this);
    }
}
