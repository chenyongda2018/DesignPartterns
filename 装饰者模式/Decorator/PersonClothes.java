package Decorator;

import Componment.Person;

/**
 * 最基本的包装Componment(Person)的包装类，持有Person引用
 *
 */
public abstract class PersonClothes implements Person {

    protected Person mPerson;

    public PersonClothes(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dress() {
        mPerson.dress();
    }
}
