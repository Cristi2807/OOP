package Lab7.Task2;

public class FigureController {

    public Figure maxAreaFig(Figure[] arr) {
        double max = 0;
        Figure z = null;
        for (Figure i : arr) {
            if (i.getArea() > max) {
                max = i.getArea();
                z = i;
            }
        }
        return z;
    }

   public Figure maxPerimeterFig(Figure[] arr) {
        double max = 0;
        Figure z = null;
        for (Figure i : arr) {
            if (i.getPerimeter() > max) {
                max = i.getPerimeter();
                z = i;
            }
        }
        return z;
    }
}
