package Ders29_StringBuilderAccessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {

    /*
     Buyuk projelerde datayi gorme(read) veya detayi degistirme(write)
     yetkilerini biebirinden bagimsiz olarak duzenlemek istenebilir.

     Access modifier ile class uyelerine baska class'lardan erisim sinirlandirilabilir
     ANCAK
     ulasilabilen dataya hem okum hem yazma yapilabilirken
     ulasilamayan data ne okunabilir ne de degistirilebilir

     gercek hayattaki ihtiyaclar dusunuldugunde
     javaya yetki sinirlamayi uyarlamak istersek

     - Eger okuma ve yazma yetkisini birlikte vermek veya vermemek soz konusu ise
       access modifier kullanilir

     - Eger okuma ve yazma yetkileri birbirinden ayrilicaksa
       o zaman access modifier yetkili olmaz
       Encapsulation (getter ve setter method'lari) kullanilmalidir.

     */

    // gett ve sett daha onceki java objelerinde karsimiza cıktıstı

    public static void main(String[] args) {


        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        // sayilar.get(1)=10;  get okumaya izin ama deger atamaya yani yazmaya izin yok.

        // System.out.println(sayilar.set(1));  sett varsa mutlaka deger atamalisin.


    }
}
