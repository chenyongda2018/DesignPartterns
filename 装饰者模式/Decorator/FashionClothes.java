package Decorator;

import Componment.Person;

/**
 * 最基本的包装Componment(Person)的包装类，持有Person引用
 *
 * 附加给Componment(Person)穿潮流衣服的功能
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
