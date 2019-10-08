class Static {

    static double mul(double a, double b, double c) {
        return a * b * c;
    }

    static void div(double d, double e) {
        System.out.println("Div result - " + d / e + ". Remain of div - " + d % e);
    }
}

class StaticTest {
    public static void main(String[] args) {
        System.out.println(Static.mul(1,2,3));
        System.out.println(Static.mul(4,5,9));
        Static.div(4, 7);
        Static.div(3,5);
    }
}
