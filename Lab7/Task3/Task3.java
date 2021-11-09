package Lab7.Task3;

import Lab7.Task2.*;

public class Task3 {
    public static void main(String[] args) {

        Figure[] objArr= new Figure[6];

        objArr[0]=new Rectangle(2.5,3.5);
        objArr[1]=new Square(3.5);
        objArr[2]=new Triangle(2.5,3,3.5);
        objArr[3]=new Triangle(3,4,5);
        objArr[4]=new Rectangle(3,2.7);

        FigureController figureController = new FigureController();


        Figure circle = new Figure() {
            public double r=3;

            public double getArea(){
                return Math.PI*r*r;
            }

            public double getPerimeter(){
                return 2*Math.PI*r;
            }

            public void printProperties() {
                System.out.println("Perimeter of the circle is: " + getPerimeter());
                System.out.println("Area of the circle is: " + getArea() + "\n");
            }

        };


        objArr[5]= circle;

        circle.printProperties();


        System.out.println("The figure with the biggest area is:" + figureController.maxAreaFig(objArr));


    }
}
