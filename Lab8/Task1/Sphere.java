package Lab8.Task1;

public class Sphere extends GeometricBody {
    double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * r * r;
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * r * r * r;
    }

    @Override
    void printProperties() {
        System.out.println("Surface area of the sphere = " + this.getSurface());
        System.out.println("Volume of the sphere = " + this.getVolume() + "\n");
    }
}
