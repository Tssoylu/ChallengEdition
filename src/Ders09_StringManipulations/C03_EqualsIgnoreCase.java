package Ders09_StringManipulations;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        String str1= "Ali";
        String str2= "ali";
        String str3= "ALI";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        System.out.println(str1.equalsIgnoreCase("Ali Can")); // false

        /*
        equals ingnore case ayni metnin buyuk ve kucuk harf kullanilarak olusturulan
        farkli yazimlarini birbirine esit olarak kabul eder
        yani equal ignore case "ali" ,"ALİ" ,"Ali" birbirine esittir.

        ama kelimede farklilik varsa bunlari tolere etmez
        a li ve ali birbirine esit degildir.
        */


    }
}
