package Lab2.Task2;



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
                Nod b = new Nod();
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

}


public class Task2 {
    public static void main(String[] args) {

        Queue q=new Queue(3);
        Queue q1=new Queue();

        q.push(100);
        q.push(200);
        q.push(300);

        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.push(4);

        q.pop();
        q1.pop();




    }
}
