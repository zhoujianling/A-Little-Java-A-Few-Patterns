package chapter2.point;

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
