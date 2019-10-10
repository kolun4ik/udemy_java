package DZ11;

public class Student {
    public String name;
    int course;
    double grade; //оценка

    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void changeName(Student s1) {
        s1.name = "Bob";
    }
    public static void swap(Student s1, Student s2) {
        // Здесь  в аргумент попадает не сам референс (Student s1),  а его копия (Student s1*)
        // Когда в параметры метода подставляются референс тип данные, на самом деле
        // подставляются копии этих референсов. И они существуют только в теле метода.
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Jone", 4, 7.8);
        Student st2 = new Student("Metue", 1, 5.3);
        swap(st1, st2);
        System.out.println("Vmesto Jone teper " + st1.name);
        System.out.println("Vmesto Metue teper " + st2.name);
        changeName(st1);
        System.out.println("Vmesto Jone teper " + st1.name);
    }
}
