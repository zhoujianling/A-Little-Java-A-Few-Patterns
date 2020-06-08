package chapter2.kebab;

public class Shallot extends DKebab {

    private DKebab k;

    public Shallot(DKebab _k) {
        this.k = _k;
    }

    public boolean isVeggie() {
        return k.isVeggie();
    }

    public Object whatHolder() {
        return k.whatHolder();
    }
}
