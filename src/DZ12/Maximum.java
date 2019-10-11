package DZ12;

import org.omg.CORBA.MARSHAL;

public class Maximum {
    void findMax(int i1, int i2, int i3) {
        int a = 5;
        if (i1 > i2 && i1 > i3) {
//            int a = 1;
            System.out.println("Maximum - " + i1);
        }
        else if (i2 > i1 && i2 > i3) {
            System.out.println("Maximum - " + i2);
        }
        else {
            System.out.println("Maximum - " + i3);
        }
    }

    void abc(){
        String str;
        int a = 10;
        if (a >= 10) {
            str = "Hellow";
        }
        if (a < 10) {
            str = "Goodby";
        } else { //Альтернативное решение нижесказанному
            str = null; // тогда str точно инициирован и ошибка компиляции исчезает
            // к if должно быть всегда else
        }
        System.out.println(str); //Несмотря на то, что мы "явно" определили str,
        // Java все равно считает, что оно не инициированно
    }

    public static void main(String[] args) {
        Maximum m = new Maximum();
        m.findMax(2,3,4);
        m.findMax(3,2,1);
    }
}
