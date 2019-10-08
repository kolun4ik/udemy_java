public class Student {
    String name;
    int course; // данная переменная инстанс переменная
    static int count; // данная переменная принадлежит всему классу
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " created.");
    }

    public static void showCount() {
        System.out.println("Vsego sozdano studentov: " + count);
    }

    public void showInfo() {
        System.out.println("Welcome Students !");
    }

    void abc(){
        a++;
        count++;
    }

    static void abcd(){
//        a++; // тут уже эту переменную нельзя вызвать, потому что она инстанс переменная
        // А так сработает
        Student st1 = new Student("Maxim", 4);
        st1.a++;

        count++;
    }
}

class StudentTest{
    public static void main(String[] args){
//        abc(); // просто вызвать метод не можем, потому что он принадлежит инстансу
        Student.abcd(); // это сработает, потому что метод принадлежит классу
        Student st1 = new Student("Ivan", 2);
        Student st2 = new Student("Mary", 1);
        Student st3 = new Student("Masha", 2);

        System.out.println(Student.count); // ссылаемся непосредственно на класс
        System.out.println(st3.count);
        System.out.println(st1.count);
        Student.showCount();
        st1.abcd();
    }
}
