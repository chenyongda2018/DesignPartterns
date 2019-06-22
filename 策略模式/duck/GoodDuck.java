package duck;

import flybehaviors.GoodFlyBehavior;
import quackbehaviors.LongQuackBehavior;

public class GoodDuck extends Duck{

    public GoodDuck() {
        mFlyBehavior = new GoodFlyBehavior();
        mQuackBehavior = new LongQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("我是好好鸭");
    }
}
