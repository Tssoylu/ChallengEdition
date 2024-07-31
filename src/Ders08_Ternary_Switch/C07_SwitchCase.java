package Ders08_Ternary_Switch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        /*
        J: Java
        D: Development
        K: Kit
        -kullanicidan bir harf alin
        alinan harf J,D,K'dan biri ise yukaridaki kelimelerden birini yazdirin
        bu harflerden biri degilse "gecersiz harf" yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz.");
        char harf=scan.next().charAt(0);

        switch (harf){

            case 'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Development");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Gecersiz harf");
        }
    }
}
