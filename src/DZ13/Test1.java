package DZ13;

public class Test1 {
}


class Student {
    int grade;
    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(5);
        if (st1.grade  == 2) {
            System.out.println("Student very bad");
        }
        else if (st1.grade == 3) {
            System.out.println("Student bad");
        }
        else if (st1.grade == 4) {
            System.out.println("Student good");
        }
        else if (st1.grade == 5) {
            System.out.println("Student very good");
        }
        else {
            System.out.println("Grade not correct");
        }
        // Use switch statement
//        Если убрать break, то будут выполняться все кейсы пока не закончится тело switch
        Student st2 = new Student(3);
        switch (st2.grade) {
            case 2:
                System.out.println("Student very bad");
                break;
            case 3:
                System.out.println("Student bad");
                break;
            case 4:
                System.out.println("Student good");
                break;
            case 5:
                System.out.println("Student very good");
                break;
            default: // срабатывает, когда не находиться соответствующий case
                System.out.println("Grade not correct");
        }
    }
}