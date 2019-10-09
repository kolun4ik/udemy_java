public class Test1 {
    int a = 1;
    static int a = 2; // здесь возникнет ошибка компилятора, две переменные с одинаковым именем

    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}
//3
//2