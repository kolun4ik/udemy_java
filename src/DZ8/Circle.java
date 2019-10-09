package DZ8;

class Circle {
    static final double PI = 3.14;

    public double areaCircle(double r) {
        return PI * r * r;
    }

    public static double lenCircle(double r1) {
        return 2 * PI * r1;
    }

    void infoCircle(double r2) {
        System.out.println("Radius = " + r2);
        System.out.println("Area of a circle = " + areaCircle(r2));
        System.out.println("Lenght of a circle = " + lenCircle(r2));
    }
}

class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area of a circle with radius = " + 5 + ": " + c.areaCircle(5));
        System.out.println(("Lenght of a circle with radius = " + 10 + ": " + c.lenCircle(10)));
        c.infoCircle(3);
    }
}
