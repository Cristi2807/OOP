package Lab2.Task3;

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

    double surfArea(){
        return 2*(width*depth+height*width+height*depth);
    }

    double volume(){
        return width*height*depth;
    }
}

class Queue{
    int elements=0;
    int maxsize;
    Nod index;
    Nod current;

    class Nod{
        int value;
       Nod next=null;
    }


    Queue(){
        this.maxsize=-1;
    }

    Queue(int maxsize){
        this.maxsize=maxsize;
    }

    void push(int val){
        if (elements<maxsize || maxsize==-1){

            if (elements > 0) {
                Queue.Nod b = new Nod();
                current.next = b;
                current = b;
            }
            else {
                current=new Nod();
                index=current;
            }
            current.value=val;

            System.out.println("Value "+val+" successfully added to queue!");

            elements++;
        }
        else {
            System.out.println("Queue "+this+ " achieved maximum size!!!");
        }

    }

    void pop(){
        if (elements>0) {
            System.out.println("Element " + index.value + " extracted from queue!");

            index=index.next;

            elements--;
        }
        else System.out.println("Queue "+this+" is already empty!");
    }

    void print(){
        Nod a=index;
        System.out.print("Queue is: ");
        if (a==null) System.out.println("empty!");
        while(a!=null){
            System.out.print(a.value+" ");
            a=a.next;
        }
    }


    boolean isEmpty() {
        if (index == null) {
            System.out.println("Queue is empty!");
            return true;
        }
        else{
            System.out.println("Queue is not empty,it has "+elements+" elements!");
            return false;
        }
    }

    boolean isFull(){
        if (maxsize==-1){
            System.out.println("The queue has no limits, as free memory is available, of course ! :)");
        return false;
        }

        if (elements<maxsize){
            System.out.println("Queue is not full! "+(maxsize-elements)+" more elements can be stored!");
        return false;
        }
        else {
            System.out.println("Queue is full! :(");
            return true;
        }

    }
}



public class Task3 {
    public static void main(String[] args) {

        Box b1=new Box(2.5,3.5,4.5);

        System.out.println("Surface area of the box is: "+b1.surfArea());

        System.out.println("Volume of the box is: "+b1.volume());

        Queue q1=new Queue(3);
        Queue q2=new Queue(4);
        Queue q3=new Queue();

        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.isEmpty();
        q1.isFull();

        q2.push(23);
        q2.push(24);
        q2.isEmpty();
        q2.isFull();

        q3.push(1);
        q3.pop();
        q3.isEmpty();
        q3.isFull();




    }
}
