package Ders29_StringBuilderAccessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candir");

        System.out.println(sb1.reverse()); // ridnaC avaJ

        System.out.println("Tersini yazdirdiktan sonra sb1 : " + sb1); // ridnaC avaJ

        System.out.println(sb1.insert(0, ".")); // .ridnaC avaJ

        sb1.reverse();

        StringBuilder sb2= new StringBuilder("Java Candir.");
        String str="Java Candir.";

        System.out.println(sb1==sb2); // false
        System.out.println(sb1==sb1); // true ancak kendisi ile karsilastirilirsa true verir.
        // System.out.println(sb1==str); farkli iki daha turu ile karsilastirilamaz.

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true ancak kendisi ile karsilastirilirsa true verir.
        System.out.println(sb1.equals(str)); // false CTE vermez fakat sonuc her zaman false'dur.

        System.out.println(sb1.compareTo(sb2)); // 0
        StringBuilder sb3 = new StringBuilder("Jaka Kandir");
        System.out.println(sb1.compareTo(sb3)); // 11

        /*
         CompareTo sadece tamamen ayni mi yoska farkli mi sorusunun cavabini verir
         tamamen ayni ise ==> 0 doner
         farklilik varsa ==> ilk farkli harfi buldugunda, fakrli harflerin arasinda akc harf oldugunu verir.
         */






    }
}
