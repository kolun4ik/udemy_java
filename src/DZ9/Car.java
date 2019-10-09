package DZ9;

public class Car {
    String color;
    String engine;
    public static  int count;
    int a=10;

    public Car(String color, String engine) {
        count++;
//        this.count++; так тоже можно обратиться к static переменной
        //this означет, что переменная принадлежит к текущему объекту
        // здесь параметр color деуйствует только в локальной обл. видимости
        this.color = color;
        this.engine = engine;
        int x = 5; // будет видна только внутри конструктора
//        int y; //У локальных переменных дефолтного значения не бывает
        int y = x;
    }
    public void showColor() {
        System.out.println("Car color is " + color);
        changeColor("red"); // можно без this,  т.к. объект уже предварительно создан
    }

    public void changeColor(String color) {
        int tsena = 5000; // local variable
        System.out.println("Сar color has changed!");
        this.color = color;
        tsena += 1000;
    }

    public static void changeA(int b) {
        //this.a = b; // так нельзя, потому что метод static, может исп без создания инстанса
        // A так можно
        Car c = new Car("cyan", "V8");
        c.a = b; // var a будет изменена в инстансе с
    }
}
