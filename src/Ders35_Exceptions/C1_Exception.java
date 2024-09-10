package Ders35_Exceptions;

import java.util.Scanner;

public class C1_Exception {
    public static void main(String[] args) {


        // kullanicidan bir tam sayi alin
        // ve sayinin tam karesini alin
        // kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        // tekrar sayi isteyin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        System.out.println(girilenSayi*girilenSayi);


    }
}
