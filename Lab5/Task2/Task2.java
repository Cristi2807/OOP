package Lab5.Task2;

public class Task2 {
    public static void main(String[] args) {

        class X {
            private String x;

            X(String a){
                x=a;
            }
        }


        class A {
            protected String a;
            X varX;

            A(String s, X s1){
                a=s;
                varX=s1;
            }
        }

        class B extends A {
            protected String b=" From class B ";

            B(String s, X s1) {
                super(s, s1);
            }
        }

        class C extends B{
            protected String c=" From class C ";

            C(String s, X s1) {
                super(s, s1);
            }
        }

        class D extends C{
            protected String d=" From class D ";

            D(String s, X s1) {
                super(s, s1);
            }
        }

        class E extends D{
            protected String e=" From class E ";

            E(String s, X s1) {
                super(s, s1);
            }
        }

        class F extends E{
            protected String f=" From class F ";

            F(String s, X s1) {
                super(s, s1);
            }
        }

        class G extends F{
            protected String g=" From class G ";

            G(String s, X s1) {
                super(s, s1);
            }
        }

        class H extends G{
            protected String h=" From class H ";

            H(String s, X s1) {
                super(s, s1);
            }
        }

        class I extends H{
            protected String i=" From class I ";

            I(String s, X s1) {
                super(s, s1);
            }
        }

        class J extends I{
            protected String j=" From class J ";

            J(String s, X s1) {
                super(s, s1);
            }
        }


        J obj10= new J("blabla",new X("some name"));

        System.out.println(obj10.varX.x+" "+obj10.a+ " "+ obj10.j);

    }
}
