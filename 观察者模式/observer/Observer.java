package observer;

public interface Observer {
    /**
     * 更新信息
     * @param temperature 温度
     * @param pressture 气压
     * @param humidity 湿度
     */
    void update(float temperature,float pressture,float humidity);
}
