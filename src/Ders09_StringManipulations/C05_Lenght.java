package Ders09_StringManipulations;

public class C05_Lenght {
    public static void main(String[] args) {

        String str= "Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length()); // 34 karakter var.

        System.out.println(str.charAt(str.length()-1)); // son karakteri elde etmek icin kullanilir

        // sondan ucuncu karakteri yazdirin

        System.out.println(str.charAt(str.length()-3)); // g


    }
}
