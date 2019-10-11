package DZ13;

public class Employee {
    public static void main(String[] args) {
        byte denNedeli = 1; // may be byte, int, short. ch, String
        switch(denNedeli) {
            case 1: // can use compile time constant
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Work until 18");
                break;
            case 6:
                System.out.println("Work until 14");
                break;
            case 7:
                System.out.println("Day off");
                break;
            default:
                System.out.println("day of week if false");
        }
    }
}
