package Ders04_matematiselislemler_İncrementDecrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a= 10;

        /*
        a variable'nin degerini yazdirip sonra a'nin degerini 1 arttirin.
         */


        System.out.println("a: " + a); // 10
        a++;

        // a artık 11


        int b= 10;
        /*
        a variale'nindegerini bir arttirip sonra yazdirin.
         */

        b++;
        System.out.println("b : " + b);

        int c =10;

        /*
        c variable'nin degerini yazdirip sonra c'nin degerini 1 arttirin.
         */

        System.out.println("c: " + c++); // 10

        int d= 10;
        /*
        d variable'nin degerini yazdirip sonra d'nin degerini 1 arttirin.
         */

        System.out.println("d: " + ++d); // 11

        /*
        c++ veya ++d yi yazdirma veya atama isleminde kullanirsaniz
        c++ 'e  post increment denir o satir icin islemi yapar sonra islemi yapar.
        ++d de ise pre increment denir, once arttirma yapip sonra islemi yapar.

        islemin oldugu satir icin bir alt satir gecildiginde
         d 'de c'de bir artmistir.
         */







    }
}
