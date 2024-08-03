package Ders14_MethodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

        /*
        - main method icerisinden iki sayi alin
        bu iki sayiyi parametre olarak kabul edip, carpimlarini bize donduren bir method olusturun.
         */

    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen iki sayi giriniz");
            double sayi1 = scan.nextDouble(); // 5
            double sayi2 = scan.nextDouble(); // 3
            System.out.println(carpimMethodu(sayi1, sayi2)); // 17.00

            double carpimSonucu= carpimMethodu(6,2); // 12.00

    }
    public static double carpimMethodu(double sayi1,double sayi2){
        System.out.println("carpim method'u calisti");
        return sayi1*sayi2;

    }
}
