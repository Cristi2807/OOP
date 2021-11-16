package Lab8.Task1;


public class Task1 {

    public static void main(String[] args) {


        Cube cube= new Cube(2.5);
        cube.printProperties();


        Sphere sphere= new Sphere(3.25);
        sphere.printProperties();

        Parallelepiped parallelepiped= new Parallelepiped(2.5,4,5.5);
        parallelepiped.printProperties();


         GeometricBody[] geometricBodies = new GeometricBody[3];

         geometricBodies[0]=cube;
         geometricBodies[1]=sphere;
         geometricBodies[2]=parallelepiped;
    }
}
