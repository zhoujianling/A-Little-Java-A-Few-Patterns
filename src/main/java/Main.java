import chapter1.Base;
import chapter1.OneMoreThan;
import chapter1.Zero;
import chapter2.kebab.Holder;
import chapter2.kebab.Radish;
import chapter2.kebab.Shallot;
import chapter2.kebab.plate.Gold;
import chapter2.kebab.rod.Dagger;
import chapter2.shish.*;

public class Main {

    public void chapter1() {
        // Is this a Num?  -> Yes
        // Similar to 0 + 1 -> 2
        new OneMoreThan(new Zero());

        // Similar to ((((0 + 1) + 1) + 1) + 1) = 4
        new OneMoreThan(
                new OneMoreThan(
                        new OneMoreThan(
                                new OneMoreThan(
                                        new Zero()
                                )
                        )
                )
        );

        // 5 is implicitly converted to new Integer(5)
        new Base(5);

        // Correct
        new Base(new Integer(5));

    }

    public void chapter2() {
        // Decorator pattern ?
        // lamb + tomato + onion + skewer(shish)
        DShish shish = new Lamb(new Tomato(new Onion(new Skewer())));
        shish.isVegetarian();
        shish.onlyOnions();

        // What is the following ?
        new Shallot(new Radish(new Holder(new Dagger()))); // It is a Kebab;
        // What is the holder ?
        new Shallot(new Radish(new Holder(new Gold())));
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Main m = new Main();
        m.chapter1();
        m.chapter2();
    }
}
