package Lab7.Task2;


public class Task2 {
    public static void main(String[] args) {


        Figure[] objArr= new Figure[5];

        objArr[0]=new Rectangle(2.5,3.5);
        objArr[1]=new Square(3.5);
        objArr[2]=new Triangle(2.5,3,3.5);
        objArr[3]=new Triangle(3,4,5);
        objArr[4]=new Rectangle(3,2.7);

        FigureController figureController = new FigureController();

        System.out.println("The figure with the biggest area is:" + figureController.maxAreaFig(objArr));

        System.out.println("The figure with the biggest perimeter is:" + figureController.maxPerimeterFig(objArr));

    }
}
