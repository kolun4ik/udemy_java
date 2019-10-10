package DZ11;

public class Car {
    /** Class Car */
    String color;
    String engine;
    int doors;

    Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest {
    static void chengeNumberDoors(Car c, int number) {
        c.doors = number;
    }
    static void changeCarColor(Car c1, Car c2) {
        String c3 = c1.color;
        c1.color = c2.color;
        c2.color = c3;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "DOHC", 2);
        Car car2 = new Car("green", "NZ1", 4);

        System.out.println(
                        "Car1 color " + car1.color +
                        " with engine " + car1.engine +
                        " and number of doors - " + car1.doors);
        System.out.println(
                        "Car2 color " + car2.color +
                        " with engine " + car2.engine +
                        " and number of doors - " + car2.doors);
        chengeNumberDoors(car1, 4);
        System.out.println("Now Car1 have a " + car1.doors + " doors");
        System.out.println("Change color between Car and Car2");
        changeCarColor(car1, car2);
        System.out.println("Now Car1 color is " + car1.color);
        System.out.println("Now Car1 color is " + car2.color);
    }
}
