package chapter2.kebab;

public class Radish extends DKebab {

    private DKebab k;

    public Radish(DKebab _k) {
        this.k = _k;
    }

    public boolean isVeggie() {
        return k.isVeggie();
    }

    public Object whatHolder() {
        return k.whatHolder();
    }
}
