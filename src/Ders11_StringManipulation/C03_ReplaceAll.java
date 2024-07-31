package Ders11_StringManipulation;

public class C03_ReplaceAll {
    public static void main(String[] args) {

        String str= "J1ava2 G9uz5ldir8";

        // str'daki sayi'lari silip metni Java Guzeldir yazdiralim

        // str.replaceAll sadce bir harf veya char sequence'i degil
        // gunelleme ile soyleyebilicegimiz ortak ozellikteki tum karakterleri degistirir.

        System.out.println(str.replaceAll("\\d","")); // Java Guzeldir

        System.out.println(str.replaceAll("\\D","")); // 12958

        String s1= "ilk gunun fiyati : 1250 TL";
        String s2= "ikinci gunun fiyati : 1500Tl";
        // iki urunun fiyatini toplayin

        s1=s1.replaceAll("\\D",""); // 1250
        s2=s2.replaceAll("\\D",""); // 1500

        // System.out.println(s1+s2); //12501500

        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // 2750

    }
}
