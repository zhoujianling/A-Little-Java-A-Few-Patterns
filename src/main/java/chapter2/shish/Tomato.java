package chapter2.shish;

public class Tomato extends DShish {

    private DShish s;

    public Tomato(DShish _s) {
        this.s = _s;
    }

    public boolean onlyOnions() {
        return false;
    }

    public boolean isVegetarian() {
        return s.isVegetarian();
    }
}
