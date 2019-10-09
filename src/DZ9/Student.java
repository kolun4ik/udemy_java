package DZ9;

public class Student {
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        String st3; // ссылка на объект, объект не создается
        String s = "Hellow world"; //единственный случай, когда объект создается без явного вызова конструктора
        st1 = null; // здесь заказывается жизнь объекта, т.е. переменная не сожержит адресс, указывающий на объект
    }
}
