package Ders15_Overloading_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        /*
        - kullanicidan toplanmak uzere tam sayilar alin
          kullanici 0'a basarsa sayi alma islemini bitirin

          kullanicinin kac sayi girdigini
          ve bu sayilarin toplaminin kac oldugunu yazdirin
         */

        Scanner scan= new Scanner(System.in);
        int girilenSayi=1; // verilen ilk deger bu soru icin 0 olamamli.
                           // cunku 0 loop'u bitirmek icin kullanilicak.
        int sayac=0;
        int toplam=0;


        while (girilenSayi!=0){
            System.out.println("Lutfen toplamak icin bir tamsayi girin"
                    + "\nBitirmek icin 0'a basin");
            girilenSayi= scan.nextInt();

            if (girilenSayi!=0){
                sayac++;
                toplam=toplam+girilenSayi;
            }
        }
        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);
    }
}
