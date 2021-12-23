public class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // public double distance() {
    //     return Math.sqrt(((0 - x) * (0 - x)) + ((0 - y) * (0 - y)));
    // }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
    }

    // public double distance(Point p) {
    //     return Math.sqrt(((this.x - p.x) * (this.x - p.x)) + ((this.y - p.y) * (this.y - p.y)));
    // }

    public double distance(Point p) {
        return distance(p.x, p.y);
    }
}
