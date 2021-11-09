package Lab7.Task2;

public class Triangle extends Figure {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public void printProperties() {
        System.out.println("Perimeter of the triangle is: " + getPerimeter());
        System.out.println("Area of the triangle is: " + getArea() + "\n");
    }

}
