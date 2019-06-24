package Decorator;

import Componment.Person;

/**
 * 包装实现类，定义了具体的附加功能
 */
public class CheapClothes extends PersonClothes{

    public CheapClothes(Person mPerson) {
        super(mPerson);
    }

    @Override
    public void dress() {
        super.dress();
        dressA();
        dressB();
    }

    private void dressA() {
        System.out.println("穿上60块钱的帆布鞋");
    }

    private void dressB() {
        System.out.println("穿上阿迪王");
    }
}
