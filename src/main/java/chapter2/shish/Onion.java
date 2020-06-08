package chapter2.shish;

public class Onion extends DShish {

    private DShish s;

    public Onion(DShish _s) {
        this.s = _s;
    }

    public boolean onlyOnions() {
        return s.onlyOnions();
    }

    public boolean isVegetarian() {
        return s.isVegetarian();
    }
}
