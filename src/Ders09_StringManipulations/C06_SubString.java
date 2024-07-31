package Ders09_StringManipulations;

public class C06_SubString {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.substring(5)); // ogren, isi kap

        System.out.println(str.substring(0)); // Java ogren, isi kap

        System.out.println(str.length()); // 19 karakter

        // son karakteri String olarak kaydedin

        String sonHarf= ""+str.charAt(str.length()-1);

        sonHarf = str.substring(str.length()-1);
        System.out.println(sonHarf); // p

        // son index'deki karakteri upper case olarak yazdirin.

        System.out.println(str.substring(str.length()-1).toUpperCase()); // p

        // son uc harfi buyuk yazdirin

        System.out.println(str.substring(str.length()-3).toUpperCase()); // KAP


    }
}
