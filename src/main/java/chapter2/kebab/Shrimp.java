package chapter2.kebab;

public class Shrimp extends DKebab {

    private DKebab k;

    public Shrimp(DKebab _k) {
        this.k = _k;
    }

    public boolean isVeggie() {
        return false;
    }

    public Object whatHolder() {
        return k.whatHolder();
    }
}
