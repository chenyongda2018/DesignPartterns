package duck;

import flybehaviors.FlyBehavior;
import quackbehaviors.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior mFlyBehavior;
    protected QuackBehavior mQuackBehavior;

    public void fly() {
        mFlyBehavior.fly();
    }

    public void quack() {
        mQuackBehavior.quack();
    }

    public abstract void display();

    public void setmFlyBehavior(FlyBehavior mFlyBehavior) {
        this.mFlyBehavior = mFlyBehavior;
    }

    public void setmQuackBehavior(QuackBehavior mQuackBehavior) {
        this.mQuackBehavior = mQuackBehavior;
    }
}
