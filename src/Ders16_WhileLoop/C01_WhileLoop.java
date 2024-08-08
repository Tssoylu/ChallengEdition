package Ders16_WhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        /*
        - 10,11,12 sayilarini toplayan bir while loop olusuturalim

         */

        int sayi=10;
        int toplam=0;

        while (sayi<=12){

            toplam+= sayi;
            sayi++;

        }

        // while loop'da once kontrol sonra islem yapilir.
        /*
        while loop'da 2 problem olusabilir
        1- once degeri kontrol edip, sonra islem yaptıgımızdan,
           body'de bir kere daha kontrol etmemiz gerekebilir.
        2- yapilan islem sayisindan 1 fazla while bitis sarti kontrol edilir.
        3- while loop oncesinde degerleri kontrol edicegimiz bir variable olusturuyorsak
           ona yapacagimiz atamayi dikkatli yapmamiz gerekir.
           yalnis deger atamasi yapmak bazen while loop'un calismamasina neden olabilir.
         */
        System.out.println(toplam);

    }
}
