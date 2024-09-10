package Ders35_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TryCatch {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi girmesini isteyip
        // girilen sayilari toplayin
        // kullanicinin islemi bitirmesk icin Q'ya basmasini isteyin
        // Q'ya bastiginda kac sayi giridini
        // ve bu sayilarin kac oldugunu yazdirin


        Scanner scan=new Scanner(System.in);
        double girilenSayi=0;
        double sayilarToplami=0;
        int sayac=0;
        boolean devam=true;

        while (devam){

            System.out.println("Toplanmak uzere sayi giriniz. \nBitirmek icin Q'ya basiniz");


            try {
                girilenSayi = scan.nextDouble();
                sayilarToplami += girilenSayi;
                sayac++;

            }catch (InputMismatchException e){

                String str= scan.next();
                if (str.equalsIgnoreCase("Q")){
                    break;
                }
            }
        }
        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + sayilarToplami);
    }
}
