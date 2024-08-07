package Ders15_Overloading_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        /*
        - kullanicidan sifre isteyip assagidaki sartlari saglamayan sifrelerden hatalari yazdirip
          kullanicidan yeni sifre girmesini isteyin, gecerli sifreyazilana kadar islemi tekrar edin
          gecerli bir sifre yazilinca "sifreniz basari ile kaydedildi" yazdirin

          sartlar:
          - sifrenin ilk karakteri kucuk harf olmali
          - sifrenin son karakteri sayi olmalidir.
         */

        Scanner scan= new Scanner(System.in);
        boolean sifreGecerliMi= false;
        String sifre="";
        int bayrak=0;

        while (sifreGecerliMi!= true){

            System.out.println("Lutfen sifrenizi giriniz");
            sifre=scan.nextLine();
            bayrak=0;

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<= 'z')){
                System.out.println("Sifrenin ilk karakteri kucuk harf olmali");
                bayrak++;
            }
            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("Sifrenin son karakteri bir sayi olmali");
                bayrak++;
            }
            if (sifre.length()<8){
                System.out.println("Sifre en az 8 karakter olmali");
                bayrak++;
            }

            if (bayrak==0){
                sifreGecerliMi=true;
                System.out.println("Sifreniz basari ile kaydedildi");
            }


        }


    }
}
