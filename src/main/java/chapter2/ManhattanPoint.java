package chapter2;

public class ManhattanPoint extends DPoint {
    private int x;
    private int y;

    public ManhattanPoint(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    int distanceToO() {
        return x + y;
    }
}
