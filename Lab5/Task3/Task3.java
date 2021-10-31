package Lab5.Task3;

public class Task3 {
    public static void main(String[] args) {

        class X {
            private String x;

            X(String x){
                this.x=x;
            }
        }


        class A {
            protected String a="from class a";
            protected X x= new X("xxx");


        }

        class B extends A {
            protected String b=" From class B ";


        }

        class C extends B{
            protected String c=" From class C ";


        }

        class D extends C{
            protected String d=" From class D ";
            protected X x= new X("xxxd");
        }

        class E extends D{
            protected String e=" From class E ";


        }

        class F extends E{
            protected String f=" From class F ";


        }

        class G extends F{
            protected String g=" From class G ";

        }

        class H extends G{
            protected String h=" From class H ";

            private X x= new X("xxxh");

            protected X getX() {
                return x;
            }
        }

        class I extends H{
            protected String i=" From class I ";


        }

        class J extends I{
            protected String j=" From class J ";


        }


        J obj10= new J();

        System.out.println(obj10.getX().x+" "+obj10.a+ " "+ obj10.j);

// it is shown the text from Class D change
        //show change in Class H
//        System.out.println(obj10.x.x+" "+obj10.a+ " "+ obj10.j);

        //implement getter :)
        System.out.println(obj10.getX().x+" "+obj10.a+ " "+ obj10.j);

    }
}
