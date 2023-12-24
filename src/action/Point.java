package action;

public class Point {
    private double a;
    private double b;

    public Point(double a, double b) {
        setX(a);
        setY(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setY(double y) {
        this.b = b;
    }

    public double getDistance(Point dest){
        double a2 = dest.getA() - getA();
        double y2 = dest.getY() - getY();

        return Math.sqrt(x2*x2 + y2*y2);
    }
}
