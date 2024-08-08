package Ders16_WhileLoop;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        /*
        - 10,11,12 sayilarini toplayan bir while loop olusturalim
         */

        int sayi=10;
        int toplam=0;


        do {
            toplam=toplam+sayi;

            sayi++;

        }while (sayi<=12);
        System.out.println(toplam);

        /*
        Do while loop'un 2 avantaji vardir.
        1- Loop body'si en az bir kere calisir
           (While Loop'da baslangic degeri uygun degilse Loop body'si hic calismayabilir)
        2- While bitis kontrolu loop kadar calisir.
           (While Loop'da bir kere fazla calisirdi)
         */

    }
}
