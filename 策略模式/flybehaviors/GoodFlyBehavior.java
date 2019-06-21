package flybehaviors;

public class GoodFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("飞行等级-高");
    }
}
