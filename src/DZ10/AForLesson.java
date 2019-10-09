package DZ10;

//import DZ9.Car;
//import DZ9.Student;
import DZ9.*;
//import java.lang.*; импортируются всегда, присутствуют по умолчанию
import static DZ9.Car.count;


public class AForLesson {
    public static void main(String[] args) {
        DZ9.Car c1 = new DZ9.Car("yellow", "NZ");
        Car c2 = new Car("black", "DOHC");
        Student st = new Student();
        System.out.println("Static import count = " + count);
    }
}
