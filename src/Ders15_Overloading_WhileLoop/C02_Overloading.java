package Ders15_Overloading_WhileLoop;

public class C02_Overloading {
    public static void main(String[] args) {


        carpim(3,5); // method call sirasinda method parantezine yazilanlara argument denir.
        carpim(3.4,2); // double integer iki sayinin cirpimi : 6.8
    }
    // Bir class'da ayni isim ve ayni signature'a sahip iki method olmaz.
    /*
    method overloading olan class'larda java hangi method'un calisicagina
    su sekilde karar verir
    1- once method ismine bakar
    2- argument sayisi ile parametre sayisina bakar
    3- argument ve parametrelerin uyumuna bakar
    4- minimum casting
     */

    public static void carpim(int sayi1, int sayi2) { // capim int int

        System.out.println("Iki integer sayinin carpimi " + sayi1 * sayi2);
    }

    public static void carpim(int sayi3, int sayi4, int sayi5) { // carpim int int int

        System.out.println("Uc integer sayinin carpimi " + sayi3 * sayi4 * sayi5);
    }

    public static void carpim(double sayi1,int sayi2){ // capim double int
        System.out.println("Double integer iki sayinin carpimi: " + sayi1*sayi2);
    }

    public static void carpim(int sayi1,double sayi2){ // capim int double
        System.out.println("Integer double iki sayinin carpimi: " + sayi1*sayi2);
    }

    public static void carpim(double sayi1,double sayi2){ // carpim double double
        System.out.println("Iki double sayinin carpimi: " + sayi1*sayi2);
    }
}
