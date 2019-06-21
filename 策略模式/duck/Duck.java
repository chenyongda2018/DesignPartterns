package duck;

import flybehaviors.FlyBehavior;
import quackbehaviors.QuackBehavior;

public abstract class Duck {
    private FlyBehavior mFlyBehavior;
    private QuackBehavior mQuackBehavior;

    public void fly() {
        mFlyBehavior.fly();
    }

    public void quack() {
        mQuackBehavior.quack();
    }

    public void setmFlyBehavior(FlyBehavior mFlyBehavior) {
        this.mFlyBehavior = mFlyBehavior;
    }

    public void setmQuackBehavior(QuackBehavior mQuackBehavior) {
        this.mQuackBehavior = mQuackBehavior;
    }
}
