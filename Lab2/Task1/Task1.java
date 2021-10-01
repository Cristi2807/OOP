package Lab2.Task1;

class Box{
    double height;
    double width;
    double depth;

    Box(){
        this.height=this.width=this.depth=1;
    }

    Box(double a){
        this.height=this.width=this.depth=a;
    }

    Box(double height,double width,double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
}


public class Task1 {
    public static void main(String[] args) {

        Box box1= new Box();

        Box box2= new Box(2.5);

        Box box3= new Box(1.0,2.6,3.5);

        System.out.println(box1.height+" "+box1.width+" "+box1.depth);

        System.out.println(box2.height+" "+box2.width+" "+box2.depth);

        System.out.println(box3.height+" "+box3.width+" "+box3.depth);

    }
}
