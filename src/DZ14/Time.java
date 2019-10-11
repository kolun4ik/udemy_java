package DZ14;

public class Time {
    void time() {
        OUTER: for (int chas=0; chas <= 23; chas++) {
            System.out.println("Start outer loop");

            INNER: for (int minuta=0; minuta<=59; minuta++) {
                System.out.println(chas + " : " + minuta);

                if (minuta == 30) {break INNER;}
            }
        }
        System.out.println("End outer loop");
    }

    public static void main(String[] args) {
        Time t = new Time();
        t.time();
    }
}
