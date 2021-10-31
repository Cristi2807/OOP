package Lab5.Task1;

public class Task1 {
    public static void main(String[] args) {

        class A {
            public String a=" From class A ";
        }

        class B extends A {
            public String b=" From class B ";
        }

        class C extends B{
            public String c=" From class C ";
        }

        class D extends C{
            public String d=" From class D ";
        }

        class E extends D{
            public String e=" From class E ";
        }

        class F extends E{
            public String f=" From class F ";
        }

        class G extends F{
            public String g=" From class G ";
        }

        class H extends G{
            public String h=" From class H ";
        }

        class I extends H{
            public String i=" From class I ";
        }

        class J extends I{
            public String j=" From class J ";
        }

        A obj1= new A();
        B obj2= new B();
        C obj3= new C();
        D obj4= new D();
        E obj5= new E();
        F obj6= new F();
        G obj7= new G();
        H obj8= new H();
        I obj9= new I();
        J obj10= new J();

        System.out.println("Class A: " + obj1.a);

        System.out.println("Class B: " + obj2.a + obj2.b);

        System.out.println("Class C: " + obj3.a + obj3.b + obj3.c);

        System.out.println("Class D: " + obj4.a + obj4.b + obj4.c + obj4.d);

        System.out.println("Class E: " + obj5.a + obj5.b + obj5.c + obj5.d + obj5.e);

        System.out.println("Class F: " + obj6.a + obj6.b + obj6.c + obj6.d + obj6.e + obj6.f);

        System.out.println("Class G: " + obj7.a + obj7.b + obj7.c + obj7.d + obj7.e + obj7.f + obj7.g);

        System.out.println("Class H: " + obj8.a + obj8.b + obj8.c + obj8.d + obj8.e + obj8.f + obj8.g + obj8.h);

        System.out.println("Class I: " + obj9.a + obj9.b + obj9.c + obj9.d + obj9.e + obj9.f + obj9.g + obj9.h
                + obj9.i);

        System.out.println("Class J: " + obj10.a + obj10.b + obj10.c + obj10.d + obj10.e + obj10.f + obj10.g + obj10.h
                + obj10.i + obj10.j);



    }
}
