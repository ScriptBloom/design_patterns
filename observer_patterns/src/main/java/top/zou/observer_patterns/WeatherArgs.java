package top.zou.observer_patterns;

import lombok.Data;

/**
 * @author dingxiang
 * @date 19-8-4 上午10:32
 */

/**
 * 天气参数类，传递给观察者的数据
 */
@Data
class WeatherArgs {
    //温度
    private String template;
    //湿度
    private String humidity;
    //气压
    private String pressure;
}
