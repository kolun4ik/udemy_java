package DZ14;

public class Test1 {

    static void abc(int n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        for(int i=1; i <11; i++, abc(10)) { //такое возможно, но лучше вызвать в теле
            System.out.println(i);
        }
        for(int j=2; j<11; j+=2){
            System.out.println(j);
        }
//        Исключение из правил
        if (false) { // компилятор не будет ругаться, но выражение в теле никогда не выполнится
            System.out.println("Yes");
        }

        for(int k=2; k<100; k++){
            if (k == 99) {
                continue; // здесь произойдет передача управления снова в цикл, значени 99 не будет распечатано
            }
            System.out.println(k);


        }
    }
}
