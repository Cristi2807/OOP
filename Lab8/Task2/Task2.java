package Lab8.Task2;

import Lab8.Task1.*;

public class Task2 {

    public static void main(String[] args) {

        GeometricBodyController geometricBodyController = new GeometricBodyController();
        GeometricBody[] geometricBodies = new GeometricBody[5];

        geometricBodies[0]=new Cube(1.5);
        geometricBodies[1]=new Sphere(2.2);
        geometricBodies[2]=new Parallelepiped(1.5,2,2.5);
        geometricBodies[3]= new Sphere(2);
        geometricBodies[4]=new Cube(2.1);

        System.out.println("The geometric body with max volume is: " + geometricBodyController.maxVolumeBody(geometricBodies) );
        System.out.println("The geometric body with max surface are is: " + geometricBodyController.maxSurfaceAreaBody(geometricBodies) );

    }

}
