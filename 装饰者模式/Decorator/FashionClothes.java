package Decorator;

import Componment.Person;

/**
 * 最基本的包装Componment的包装类，持有Person引用
 * 潮流衣服
 */
public class FashionClothes extends PersonClothes {


    public FashionClothes(Person mPerson) {
        super(mPerson);
    }

    @Override
    public void dress() {
        dressA();
        super.dress();
        dressB();
    }

    private void dressA() {
        System.out.println("穿上AJ");
    }

    private void dressB() {
        System.out.println("垮上Supreme");
    }
}
