package Ders12_ForLoops;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        /*
        - kullanicinin verdigi sayinin rakamlar toplamini bulun
         */

        long sayi= 45324210313421L;
        String sayiStr="" + sayi;

        long birlerBasamagi=0;
        long rakamlarToplami=0;

        for (int i = 0; i < sayiStr.length(); i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlarToplami);
    }
}
