package Ders06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        -kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        ucgen eskenar ise "Eskenar ucgen " yazidrin ,degilse "Eskenar degil" yazidirin.
        kenar uzunlukları 0  veya negatif ise "gecersiz kenar uzunlugu" yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz.");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1<=0 || kenar2<=0 || kenar3<=0) {
            System.out.println("Gecersiz kenar uzunlugu");
        } else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");

        }

    }
    }
