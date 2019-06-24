import Componment.Boy;
import Componment.Person;
import Decorator.CheapClothes;
import Decorator.FashionClothes;
import Decorator.PersonClothes;

public class TestDecorator {
    public static void main(String[] args) {
        Person xiaoming = new Boy();
        PersonClothes cheapClothes = new CheapClothes(xiaoming);
        PersonClothes fashionClothes = new FashionClothes(xiaoming);

        cheapClothes.dress();
        System.out.println("---------有钱了之后-------");
        fashionClothes.dress();
    }
}
