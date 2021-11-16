package Lab8.Task1;

public class Cube extends GeometricBody {
    double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double getSurface() {
        return 6 * a * a;
    }

    @Override
    public double getVolume() {
        return a * a * a;
    }

    @Override
    void printProperties() {
        System.out.println("Surface area of the cube = " + this.getSurface());
        System.out.println("Volume of the cube = " + this.getVolume() + "\n");
    }
}
