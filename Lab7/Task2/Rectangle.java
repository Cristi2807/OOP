package Lab7.Task2;

public class Rectangle extends Figure {

    double length, width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void printProperties() {
        System.out.println("Perimeter of the rectangle is: " + getPerimeter());
        System.out.println("Area of the rectangle is: " + getArea() + "\n");
    }

}
