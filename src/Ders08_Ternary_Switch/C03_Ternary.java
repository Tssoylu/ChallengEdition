package Ders08_Ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int a= 5;

        /*
        Ternary operatoru tek basına kullabiliamaz
        ternary bize bir sonuc uretir
        bu sonucu ya direkt yazdirmali
        veya bir variabley'a atamaliyiz.
         */

        String  sonuc =a%2==0? "Cift sayi" : "Tek sayi";
        System.out.println(sonuc);


        /*
        turary'nin sonucunu bir variable'a atayacaksak
        true ve false durumlarinda uretilecek sonucun
        ayni data turune uygun olmasi gerekir.
        aksi halde CTE eroru olusur.
        ama ternary'i sout icinde kullanirsak sartlar ayni olmaz.
         */
        String sonuc2= a>10 ? "buyuk sayi" : ""+2*a;

        // CTE vermemesi icin String'e cevirdik

        System.out.println(a>10 ? "buyuk sayi" : 2*a );



    }
}
