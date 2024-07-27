package Ders03_datacastingWrapperClass;

public class C05_WrapperClass {

    public static void main(String[] args) {

        int sayi=10;

        String str="Java cok guzel";

        /*
        primitive data turleri sadece deger barindirirlar hazir methodlar'ı yoktur.

        Java'ya yapilan talepler sonucunda java primitive data turleri ile bazi hazir
        methodlar'in kullanilabilmesi icin Wrapper Class'lar olusturmustur.

        Wrapper Class'lar primitive data turlerindeki degerleri alirlar
        anca methodlari da vardir.
         */

        char krk='b';

        Character krkWrapper='c';

        System.out.println(Character.isLetter('5')); // false  kelime olmadigi icin.

        System.out.println(Character.isDigit('7')); // true

        String str1="123";
        String str2="12";

        /*
        str1 ve str2'nin degerlerini matematiksel olarak toplayin.
         */

        System.out.println(str1 + str2); // 12312

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); // 135

        /*
        Integer.parseInteger(str) icine yazilan str rakamlardan olusuyorsa str'i int'a cevirir.
        ancak bir karakter bile rakam degilse hata verir.
         */

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768



    }
}
