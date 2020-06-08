package chapter2.shish;

public class Lamb extends DShish {

    private DShish s;

    public Lamb(DShish _s) {
        this.s = _s;
    }

    public boolean onlyOnions() {
        return false;
    }

    public boolean isVegetarian() {
        return false;
    }
}
