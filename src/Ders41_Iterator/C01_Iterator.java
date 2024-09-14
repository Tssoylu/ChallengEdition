package Ders41_Iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        // Java collections icindeki bazi class'lar index desteklemez
        // bu durumda index kullanmadan collection icerisindeki tum elementlere ulasabilmek
        // ve onlari update edebilmek icin farkli ihtiyaclarimiz olur.

        // List<> index yapisini destekledigi icin boyle bir ihtiyac duymaz
        // ancak bu gunluk index kullanmadan list elementlerine ulasmaya
        // ve onlari update etmeye calisalim


        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // index kullanmadan list'in tum elementlerini yazdirin.

        for (Integer each : sayilar
        ) {
            System.out.println(each + " ");
        }

        // index kullanmadan list'in elementlerini bir arttirin
        // index kullanmadan 25'den buyuk sayilari list'den silin


        for (Integer each : sayilar
        ) {
            System.out.println(each + 1 + " ");
        }

        System.out.println(sayilar); // [10, 20, 30, 40]


        for (Integer each : sayilar
        ) {
            each += 1;
            System.out.println(each + " ");
        }
        System.out.println(sayilar); // [10, 20, 30, 40]


        /* index kullanmadan list'in elemanlarini kalici olarak degistirmek mumkun olmadi
         java bunun icin Iterator(otelemek,yavas yavas tekrar etmek) Interface'i olusturmustur
        */

    }
}
