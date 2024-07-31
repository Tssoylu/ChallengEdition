package Ders03_DatacastingWrapperClass;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi=20;

        /* genis data turundeki bir degeri
        dar data turundeki bir variable'a atamak isterseniz
        java sorumlulugu almanizi ister.

        bu sorumululugu almak icin
        cast edecegimiz deger'İn onune () icerisine
        cast etmek istedimiz data turu yazilir.

         ancak bu durum da data kayiplari olabilir (double'den int'e gecerken virgulden sonrasi silinir)
         veya baskalasim olabilir (int'i byte cevirirsek tekrar tekrar basa doner).
         */
        short sh=(short)sayi;

        System.out.println(sh); //20

        double dbl=23.5;

        int say=(int)dbl;

        System.out.println(say); //23

        say=132; // int

        byte byt=(byte) say;

        System.out.println(byt); //15












    }
}
