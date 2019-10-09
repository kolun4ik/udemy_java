public class Outputs {
    public static void abc() {
        String s1 = new String("ABCD");
        String s2 = new String("EFGJ");
    }

    public static void main(String[] args) {
        Outputs o1 = new Outputs();
        abc();
        abc();
        String s1 = new String("ABCD");
        abc();
    }
}

