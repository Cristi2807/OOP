package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

//Am realizat labul mai devreme de a fi explicat ca trebuie pe taskuri.

public class First {

    public static void main(String[] args) {

        Monitor LG= new Monitor();

        LG.color="gray";
        LG.height=20.5;
        LG.width=10.5;
        LG.resolution="1024x768";
        LG.color="blue";


        Monitor Samsung = new Monitor();

        Samsung.color="red";
        Samsung.height=15;
        Samsung.width=20;
        Samsung.resolution="1920x1080";

        System.out.println(Samsung==LG);
        System.out.println(Samsung.width!= LG.height);


        Student stud11 =new Student();
        stud11.firstName="A";
        stud11.lastName="B";
        stud11.age=20;
        stud11.mark=9.57;


        Student stud12 =new Student();
        stud12.firstName="B";
        stud12.lastName="C";
        stud12.age=22;
        stud12.mark=8.6;


        University univ1 =new University();
        univ1.name="Oxford";
        univ1.fondYear=1900;

        univ1.stud.add(stud11);
        univ1.stud.add(stud12);



        ArrayList<University> a= new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int nr=0; double s=0;

        for (int i = 0; i < 3; i++) {
        University univ = new University();
        System.out.print("Numele universitatii "+(i+1)+" :");
        univ.name=in.next();
        System.out.print("Anul fondarii: ");
        univ.fondYear=in.nextInt();
        System.out.print("Numarul de studenti: ");
        int y=in.nextInt();
        nr=nr+y;

            for (int j = 0; j <y ; j++) {
                Student stud =new Student();
                System.out.print("Prenumele studentului "+(j+1)+" din univ "+univ.name+" :");
                stud.firstName=in.next();
                System.out.print("Numele studentului "+(j+1)+" din univ "+univ.name+" :");
                stud.lastName= in.next();
                System.out.print("Varsta studentului "+stud.firstName+" "+stud.lastName+" din univ "+univ.name+" :");
                stud.age=in.nextInt();
                System.out.print("Nota studentului "+stud.firstName+" "+stud.lastName+" din univ "+univ.name+" :");
                stud.mark=in.nextDouble();
                s=s+stud.mark;
                univ.stud.add(stud);
            }
            a.add(univ);
        }

        System.out.println("Nota medie pe toate 3 universitati: "+(s/nr));

    }
}

class Monitor{
    String color;
    double width;
    double height;
    String resolution;

}

class Student{
    String firstName;
    String lastName;
    int age;
    double mark;
}

class University{
     String name;
     int fondYear;
    ArrayList<Student> stud =new ArrayList<>();
}

