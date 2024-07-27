package Ders03_datacastingWrapperClass;

public class C01_DataCasting {

    public static void main(String[] args) {

        /* bazı daha turleri asla birbirine cast edilmez

         */

        // String str=20;

        // boolean mutluMu="true";

        // int a=true;

        double s=20;

        int sayi=15;

        long ln=sayi; // esitligin sol tarafi long, sag tarafi yani degerint
                      // java itiraz etmedi.

        /* dar data turunden bir degeri
        genis data turundeki variable'a atama yaparsaniz
        java bunu otomatik olarak yapar.
         */

        short sh=23;

        int a=sh;

        long lng=sh;

        float fl=lng;

        /* ama tersini yapmak isterseniz
        yani buyuk data turundeki bir degeri
        kucuk data turundeki variable'a atamak isterseniz java kabul etmez.
         */

        double dbl=20;

        // a = dbl;

        // short abc= dbl;











    }
}
