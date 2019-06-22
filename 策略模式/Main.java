import duck.BadDuck;
import duck.GoodDuck;

public class Main {
    public static void main(String[] args) {
        BadDuck badDuck = new BadDuck();
        badDuck.fly();
        badDuck.quack();
        badDuck.display();

        GoodDuck goodDuck = new GoodDuck();
        goodDuck.fly();
        goodDuck.quack();
        goodDuck.display();
    }
}
