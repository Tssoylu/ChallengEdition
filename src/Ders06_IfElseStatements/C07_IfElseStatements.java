package Ders06_IfElseStatements;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        /*
        kullanicidan bir karakter isteyin, girilen karakter kucuk harf ise onu buyuk harf yapiniz.
        yoksa girilen harfi yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz.");
        char krk=scan.next().charAt(0);

        if (krk>='a' && krk<='z') {
            //kucuk harf girildi demektir.
            System.out.println((char)(krk-32));

        }else {
            System.out.println(krk);
            //kucuk harf degil demektir.
        }


    }
}
