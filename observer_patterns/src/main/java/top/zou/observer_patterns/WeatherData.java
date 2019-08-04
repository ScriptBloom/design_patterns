package top.zou.observer_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingxiang
 * @date 19-8-4 上午10:27
 */

/**
 * 主题对象 事项Subject接口 天气信息管理类
 */
public class WeatherData implements Subject{
    private WeatherArgs args = new WeatherArgs();
    private List<Observer> obs = new ArrayList<>();
    private boolean changed = false;

    //设置数据
    void setWeatherData(String template,String humidity,String pressure){
        args.setTemplate(template);
        args.setHumidity(humidity);
        args.setPressure(pressure);
        setChanged();
        onWeatherDataChanged();
    }
    //数据更新时通知观察者 push数据给观察者
    private void onWeatherDataChanged(){
        if(getChanged()){
            notifyObservers(obs);
        }
    }
    //观察者注册
    public void registerObserver(Observer o) {
        if(o==null){
            throw new RuntimeException();
        }
        obs.add(o);
    }
    //观察者移除
    public void removeObserver(Observer o) {
        obs.remove(o);
    }
    //通知观察者们数据更新 发送数据给观察者们
    public void notifyObservers(List<Observer> obs) {
        obs.forEach((o)->o.update(this,args));
    }

    @Override
    public void setChanged() {
        changed = true;
    }

    @Override
    public boolean getChanged() {
        return changed;
    }
}
