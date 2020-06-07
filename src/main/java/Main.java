import chapter1.Base;
import chapter1.OneMoreThan;
import chapter1.Zero;

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

    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Main m = new Main();
        m.chapter1();
        m.chapter2();
    }
}
