package chapter2.kebab;

public class Holder extends DKebab {

    private Object o;

    public Holder(Object _o) {
        this.o = _o;
    }

    public boolean isVeggie() {
        return true;
    }

    public Object whatHolder() {
        return o;
    }
}
