package ObserverInJava;

import ObserverableInJava.WeatherDataObservable;
import ObserverableInJava.WeatherDataObservable.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * 实现了Java内置观察者接口
 */
public class CurrentCondition implements Observer {

    private String mCity;
    private float mTemperature;
    private float mPressture;
    private float mHumidity;

    @Override
    public void update(Observable o, Object arg) {
        setmTemperature(((Data)(arg)).mTemperature);
        setmPressture(((Data)(arg)).mPressture);
        setmHumidity(((Data)(arg)).mHumidity);
        display();
    }

    /**
     * 展示公告板的信息
     */
    public void display() {
        System.out.println("********"+mCity+"今日天气信息*******");
        System.out.println("温度:"+this.mTemperature);
        System.out.println("气压:"+this.mPressture);
        System.out.println("湿度:"+this.mHumidity);
        System.out.println("********"+mCity+"今日天气信息********");
    }


    public CurrentCondition(String city) {
        this.mCity = city;
    }

    public CurrentCondition(float mTemperature, float mPressture, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressture = mPressture;
        this.mHumidity = mHumidity;
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public void setmTemperature(float mTemperature) {
        this.mTemperature = mTemperature;
    }

    public float getmPressture() {
        return mPressture;
    }

    public void setmPressture(float mPressture) {
        this.mPressture = mPressture;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setmHumidity(float mHumidity) {
        this.mHumidity = mHumidity;
    }
}
