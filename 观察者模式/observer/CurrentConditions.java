package observer;

/**
 * 公告板-观察者
 */
public class CurrentConditions implements Observer{

    private String mCity;
    private float mTemperature;
    private float mPressture;
    private float mHumidity;

    /**
     * 更新公告板上的天气信息
     * @param temperature 温度
     * @param pressture 气压
     * @param humidity 湿度
     */
    @Override
    public void update(float temperature, float pressture, float humidity) {
        this.mTemperature = temperature;
        this.mPressture = pressture;
        this.mHumidity = humidity;
        display();
    }

    /**
     * 展示公告板的信息
     */
    public void display() {
        System.out.println("*******"+mCity+"今日天气信息*******");
        System.out.println("温度:"+this.mTemperature);
        System.out.println("气压:"+this.mPressture);
        System.out.println("湿度:"+this.mHumidity);
        System.out.println("*******"+mCity+"今日天气信息*******");
    }

    public CurrentConditions(String city) {
        this.mCity = city;
    }

    public CurrentConditions(float mTemperature, float mPressture, float mHumidity) {
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
