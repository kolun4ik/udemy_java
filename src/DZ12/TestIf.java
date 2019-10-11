package DZ12;

public class TestIf {
    public static void main(String[] args) {
        int a = 20;
        if (a < 30)
            System.out.println("a lt 30");
        // Вторая строка уже не пренадлежит выражению if
            System.out.println("This statement not is if statement");
            a = 35;
            if (a > 30) {
                System.out.println("a gt 30");
                System.out.println("This statement is if statement");
            }
            if (a < 40); // пустой if
            System.out.println("This statement is if; statement");

        boolean b = false;
        if (!b)
            System.out.println(b);

        //Ternary operator
        int d = 10;
        int j = 20;
        int max = (d < j)? j : d;
        System.out.println(max);

    }
}
