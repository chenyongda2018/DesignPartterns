package duck;

import flybehaviors.BadFlyBehavior;
import quackbehaviors.ShortQuackBehavior;

public class BadDuck extends Duck{

    public BadDuck() {
        mFlyBehavior = new BadFlyBehavior();
        mQuackBehavior = new ShortQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("我是坏坏鸭");
    }
}
