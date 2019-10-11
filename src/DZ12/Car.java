package DZ12;

public class Car {
    /** Class Car */
    int engine;
    int doors;

    Car(int engine, int doors) {
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(4, 4);
        Car car2 = new Car(3, 5);
        //Внутренние и внешние if выражения, сначала определяем внутреннюю пару if|else, затем внешнюю
        if (car1.engine > car2.engine)
            if ( car1.doors > car2.doors)
                System.out.println("Power of motors and count of doors car1 greater");
            else
                System.out.println("Powre of motors Car1 greater, count of doore lighter");
            else
                System.out.println("Power of motors Car1 lighter");
        // Сравнение объектов, нельзя ==, можно equals
        Car car3 = new Car(4, 4);
        Car car4 = new Car(3, 5);
        if (car3.engine > car4.engine) {
            if (car3.doors > car4.doors) {
                System.out.println("Power of motors and count of doors car3 greater");
            } else {
                System.out.println("Powre of motors Car3 greater, count of doore lighter");}
        } else {
            System.out.println("Power of motors Car1 lighter");
        }
    }
}