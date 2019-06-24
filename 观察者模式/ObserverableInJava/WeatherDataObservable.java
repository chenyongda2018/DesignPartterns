package ObserverableInJava;

import java.util.Observable;

/**
 * 继承了Java内置的被观察者
 */
public class WeatherDataObservable extends Observable {

    private float mTemperature; //温度
    private float mPressture; //气压
    private float mHumidity;//湿度

    public void setData(float temperature, float pressture, float humidity) {
        this.mTemperature = temperature;
        this.mPressture = pressture;
        this.mHumidity = humidity;
        dataChange();
    }


    public void dataChange() {
        this.setChanged(); //为true时，才能向观察者们发送信息，每一次发送信息后自动变为false
        //这里被观察者主动发送信息，属于观察者模式中的推模型
        //与之相对的推模型是 this.notifyObservers() 让观察者们自己主动拉取信息
        this.notifyObservers(new Data(getmTemperature(), getmPressture(), getmHumidity()));
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

    /**
     * 信息的包装类
     */
    public class Data {

        public float mTemperature;
        public float mPressture;
        public float mHumidity;


        public Data(float mTemperature, float mPressture, float mHumidity) {
            this.mTemperature = mTemperature;
            this.mPressture = mPressture;
            this.mHumidity = mHumidity;
        }

    }
}
