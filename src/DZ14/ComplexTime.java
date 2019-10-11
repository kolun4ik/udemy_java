package DZ14;

public class ComplexTime {
    static void showComplexTime() {
        System.out.println("Start clock");
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minuta = 0; minuta < 60; minuta++){
                if (hour > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int sec = 0; sec < 60; sec++){
                    if (hour * sec > minuta){
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minuta + ":" + sec);
                }
            }
        }
        System.out.println("End clock");
    }

    public static void main(String[] args) {
        ComplexTime ct = new ComplexTime();
        showComplexTime();
    }
}
