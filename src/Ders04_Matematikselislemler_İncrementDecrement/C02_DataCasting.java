package Ders04_Matematikselislemler_İncrementDecrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {

        /*
        soru 4- Kullanicidan iki double sayi alin,
        ilk sayiyi ikinci sayiya bolun islemin sonucunun tam sayi kismini yazdirin.
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        int bolmeSonucuTamsayi= (int) (sayi1/sayi2);

        System.out.println(bolmeSonucuTamsayi);



    }
}
