package Ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {

        /*
        -kullanicidan cinsiyetini ve yasini alin, kadin,60 , yas ve uzeri, erkek 65 yas ve uzeri emeklileri
        "emekli olabilirsin"  veya "emekli olmak için ... yil daha calisman gerekir" yazdirin.
         */

        /*
        ana degisken yas olsun
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Lutfen cinsiyeti giriniz E/K");
        char cinsiyet = scan.next().charAt(0);
// mmantık hatası
        if (yas < 15) {
            System.out.println("Hatali yas girisi");
        } else if (yas < 60) {
            // emekli olamaz,caslismasi gereken sure cinsiyete bagli
            System.out.println("emekli olamazsin");
            if (cinsiyet == 'K' || cinsiyet == 'k') {
                System.out.println("daha :" + (60 - yas) + " sene calismalisin");
                return;
            } else if (cinsiyet == 'e' || cinsiyet == 'E') {
                System.out.println("daha :" + (65 - yas) + " sene calismalisin");
                return;
            } else {
                System.out.println("hatali cinsiyet girisi");
                return;
            }

        }
        if (yas < 65) {
            // kadin ise emekli olabilir, erkek calismasi lazim
            if (cinsiyet == 'K' || cinsiyet == 'k') {
                System.out.println("emekli olabilirsin");
            } else if (cinsiyet == 'e' || cinsiyet == 'E') {
                System.out.println("daha :" + (65 - yas) + " sene calismalisin");
            } else {
                System.out.println("hatali cinsiyet girisi");
            }
        } else { // yas 65'den buyukse
            System.out.println("emekli olabilirsin");
        }

    }
}


