package Ders13_NestedForLoops_MethodOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {

        /*
        - kullanicidan iki sayi alip bunlarin toplamini yazdiran bir method olusturun
         */

        isteToplaYazdir();
       // isteToplaYazdir(); kac kere yazdirilirsa okadar yazdirir tekrarlanabilir ve diger class'larda kullanilabilir


    }

    public static void isteToplaYazdir(){

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Girilen sayi toplami : " + (sayi1+sayi2));





}
}
