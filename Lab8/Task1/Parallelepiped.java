package Lab8.Task1;

public class Parallelepiped extends GeometricBody {

    double l, w, h;

    public Parallelepiped(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    @Override
    public double getSurface() {
        return 2 * l * w + 2 * l * h + 2 * w * h;
    }

    @Override
    public double getVolume() {
        return l * w * h;
    }

    @Override
    void printProperties() {
        System.out.println("Surface area of the parallelipiped = " + this.getSurface());
        System.out.println("Volume of the parallelipiped = " + this.getVolume() + "\n");
    }
}
