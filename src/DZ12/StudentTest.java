package DZ12;

import DZ11.Student;

class StudentTest {
    static void studentEquals(Student s1, Student s2) {
        /** Show student equals*/
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("Students " + s1.name + " and " + s2.name + " equals");
        } else {
            System.out.println("Students " + s1.name + " and " + s2.name + " not equals");
        }
    }

    public static void showEqualItems(Student s1, Student s2) {
        if (s1.name.equals(s2.name)){
            System.out.println(s1.name + " equals " + s2.name);
            if (s1.course == s2.course){
                System.out.println(s1.course + " equals " + s2.course);
                if (s1.grade == s2.grade) {
                    System.out.println(s1.grade + " equals " + s2.grade);
                } else {
                    System.out.println(s1.grade + " not equals " + s2.grade);
                }
            } else {
                System.out.println(s1.course + " not equals " + s2.course);
            }
        } else {
            System.out.println(s1.name + " not equals " + s2.name);
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Vasya", 3, 8.9);
        Student st2 = new Student("Petya", 1, 7.2);
        studentEquals(st1, st2);
        Student st3 = new Student("Vasya", 3, 8.9);
        studentEquals(st1, st3);
        System.out.println("Comparing students  display equal items.");
        showEqualItems(st1, st2);
        showEqualItems(st1, st3);
        Student st4 = new Student("Vasya", 3, 7.0);
        showEqualItems(st1, st4);
    }
}

