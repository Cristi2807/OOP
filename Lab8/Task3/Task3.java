package Lab8.Task3;

interface GeometricBody {
   double getSurface();

   double getVolume();

   void printProperties();
}

 class Cube implements GeometricBody {
    double a;

    Cube(double a) {
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
    public void printProperties() {
        System.out.println("Surface area of the cube = " + this.getSurface());
        System.out.println("Volume of the cube = " + this.getVolume() + "\n");
    }
}

 class Parallelepiped  implements GeometricBody {

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
    public void printProperties() {
        System.out.println("Surface area of the parallelipiped = " + this.getSurface());
        System.out.println("Volume of the parallelipiped = " + this.getVolume() + "\n");
    }
}


class Sphere implements GeometricBody {
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
    public void printProperties() {
        System.out.println("Surface area of the sphere = " + this.getSurface());
        System.out.println("Volume of the sphere = " + this.getVolume() + "\n");
    }
}


public class Task3 {
    public static void main(String[] args) {

        Cube cube= new Cube(2.5);
        cube.printProperties();


       Sphere sphere= new Sphere(3.25);
        sphere.printProperties();

        Parallelepiped parallelepiped= new Parallelepiped(2.5,4,5.5);
        parallelepiped.printProperties();
    }
}
