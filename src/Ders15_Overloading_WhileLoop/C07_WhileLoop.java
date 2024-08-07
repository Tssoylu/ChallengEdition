package Ders15_Overloading_WhileLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {

        /*
        - kullanicidan bir sayi ve hesaplamak itedigi ussu isteyin
          While Loop kullanicidan verilen sayinin istenen ussunu hesaplayip yazdiran bir method olsuturun.
         */

        int sayi=2;
        int us=5;
        usHesapla(sayi,us);



    }

    public static void usHesapla(int sayi,int us){

        int sonuc=1;

        while (us>0){
            sonuc*=sayi;
            us--;
        }
        System.out.println(sonuc);

    }
}
