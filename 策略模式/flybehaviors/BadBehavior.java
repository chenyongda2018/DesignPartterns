package flybehaviors;

public class BadBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞行等级-低");
    }
}
