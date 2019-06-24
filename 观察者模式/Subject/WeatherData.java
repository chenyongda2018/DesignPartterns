package Subject;

import observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float mTemperature;
    private float mPressture;
    private float mHumidity;
    private ArrayList<Observer> mObservers;

    public WeatherData() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (mObservers.contains(observer)) {
            mObservers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : mObservers) {
            observer.update(getmTemperature(), getmPressture(), getmHumidity());
        }
    }


    public void setData(float temperature, float pressture, float humidity) {
        this.mTemperature = temperature;
        this.mPressture = pressture;
        this.mHumidity = humidity;
        notifyObservers();
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
