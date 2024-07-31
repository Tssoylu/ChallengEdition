package Ders09_StringManipulations;

public class C07_SubString {
    public static void main(String[] args) {

        String str= "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5, 8)); // gun
        // 5. index'den baslar (8-5) karakter yazdirir.
        // 5. karakter dahil (inclusive) 8. index haric (exclusive).

        // gectikce yazdirin

        System.out.println(str.substring(9,17)); // gectikce

        System.out.println(str.substring(3,7)); // a gu

        String isim= "huseYİN";

        // verilen isimi ilk harfi buyuk geri kalanlari kucuk harf olarak kaydedin.

        isim=isim.substring(0,1).toUpperCase()+
             isim.substring(1).toLowerCase();
        System.out.println(isim); // Huseyin


        // System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase());

        // sadece 3. index'deki harfi yazdirin

        System.out.println(isim.substring(3,4)); // e

        System.out.println(isim.substring(2,2)); // "" hiclik yazdirir

        // System.out.println(isim.substring(5,2)); // StringIndexOutOfBoundsException hatasi verir.



    }
}
