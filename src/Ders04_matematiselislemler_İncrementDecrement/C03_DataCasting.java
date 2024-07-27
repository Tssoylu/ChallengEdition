package Ders04_matematiselislemler_İncrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        /*
        kullanicidan iki integer deger alip
        bunlari birbirine bolun ve sonucu double olarak yazdirin.
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz");

        int sayi1= scan.nextInt(); // 20
        int sayi2= scan.nextInt(); // 6

        System.out.println(sayi1/sayi2);

        double ondalikliSonuc= (double) (sayi1/sayi2); // (double) (3) ===> 3.0

        System.out.println(ondalikliSonuc); // 3.0

        double dogruSonuc= (double)sayi1/ sayi2; // double /int ===> genis olan gore sonuc verir

        System.out.println(dogruSonuc); // 3.333333335












    }
}
