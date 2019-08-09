import static java.lang.Math.*;

public class Triangle implements GeometricObject {

    public double s(Point s1, Point s2) {
        double a = (pow((s1.getX()-s2.getX()), 2) + pow((s1.getY()-s2.getY()),2));
        return sqrt(a);
    }

    @Override
    public double getArea() {
        double a = abs(p1.getX()*(p2.getY()-p3.getY())+p2.getX()*(p3.getY()-p1.getY())+p3.getX()*(p1.getY()-p2.getY()));
        return a/2;

    }

    @Override
    public double getPerimeter() {
        return s(p1, p2) + s(p2, p3) + s(p3, p1);
    }

    @Override
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]", p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY());
    }

    private Point p1;
    private Point p2;
    private Point p3;


    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if ((p1.getX() == p2.getX() && p1.getY() == p2.getY())
                || (p2.getX() == p3.getX() && p2.getY() == p3.getY())
                || (p3.getX() == p1.getX() && p3.getY() == p1.getY())
        ) {
            throw new RuntimeException("có 2 điểm trùng nhau");
        } else if (((p1.getX() - p2.getX()) / (p3.getX() - p2.getX())) == ((p1.getY() - p2.getY()) / (p3.getY() - p2.getY()))) {
            throw new RuntimeException("3 điểm thẳng hàng");
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }
}
