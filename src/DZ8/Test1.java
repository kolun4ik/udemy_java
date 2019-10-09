package DZ8;

public class Test1 {
    public final int a = 10; // уже нигде не можем изменить значения

    public void abs(short s){
        final byte b;
        b = 10; // локальные перем не имеют дефолтного значения, пэтому присваиваем
        System.out.println(s + b);
    }

    public static void main(String[]  args){
        Test1 t = new Test1();
//        t.a = t.a * 2;
        System.out.println(t.a);
    }
}
