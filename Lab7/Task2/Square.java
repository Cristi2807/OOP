package Lab7.Task2;

public class Square extends Figure {

    double a;

    public Square(double a) {
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }

    public double getPerimeter() {
        return 4 * a;
    }

    public void printProperties() {
        System.out.println("Perimeter of the square is: " + getPerimeter());
        System.out.println("Area of the square is: " + getArea() + "\n");
    }

}
