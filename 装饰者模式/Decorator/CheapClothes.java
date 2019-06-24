package Decorator;

import Componment.Person;

/**
 * 最基本的包装Componment(Person)的包装类，持有Person引用
 *
 * 附加给Componment(Person)穿便宜衣服的功能
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
