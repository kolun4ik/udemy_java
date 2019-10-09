package DZ10.p4;
import DZ10.p1.A;

import DZ10.p1.p2.p3.C;
import DZ10.p4.p5.E;

import static DZ10.p1.p2.B.*;

public class D {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Elements of class A - " + a.str);
        System.out.println("Static elements of class B - " + b);
        abc();
        C c = new C();
        E e = new E();

    }
}
