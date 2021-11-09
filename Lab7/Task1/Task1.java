package Lab7.Task1;

abstract class Figure{

    abstract double getArea();

    abstract double getPerimeter();
}


class Triangle extends Figure{

    double a,b,c;

    Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getArea(){
        double s=getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double getPerimeter(){
        return a+b+c;
    }

    public void printProperties(){
        System.out.println("Perimeter of the triangle is: "+getPerimeter());
        System.out.println("Area of the triangle is: "+getArea()+"\n");
    }

}


class Square extends Figure{

    double a;

    Square(double a){
        this.a=a;
    }

    public double getArea(){
        return a*a;
    }

    public double getPerimeter(){
        return 4*a;
    }

    public void printProperties(){
        System.out.println("Perimeter of the square is: "+getPerimeter());
        System.out.println("Area of the square is: "+getArea()+"\n");
    }

}


class Rectangle extends Figure{

    double length,width;

    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    public void printProperties(){
        System.out.println("Perimeter of the rectangle is: "+getPerimeter());
        System.out.println("Area of the rectangle is: "+getArea()+"\n");
    }

}



public class Task1 {

    public static void main(String[] args) {

        Triangle triangle=new Triangle(3,4,5);
        triangle.printProperties();


        Square square= new Square(4.5);
        square.printProperties();


        Rectangle rectangle= new Rectangle(2.5,3);
        rectangle.printProperties();

        Figure[] objArr = new Figure[10];

        objArr[0]=triangle;
        objArr[1]=square;
        objArr[2]=rectangle;

    }
}
