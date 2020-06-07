package chapter2;

public class CartesianPoint extends DPoint {

    private int x;
    private int y;

    int distanceToO() {
        return (int) Math.sqrt(x * x + y * y);
    }
}
