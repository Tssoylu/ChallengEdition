package Ders07_NestedIfElseStatements;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {

        /*
        -kullanicidan cinsiyetini ve yasini alin, kadin,60 , yas ve uzeri, erkek 65 yas ve uzeri emeklileri
        "emekli olabilirsin"  veya "emekli olmak için ... yil daha calisman gerekir" yazdirin.
         */


        char cinsiyet = 'K';
        int yas = 56;

        /*
        nested if else seklinde kullanim icin once ana degiskeni secip
        ona gore ana yapiyi olusturalim
        cinsiyet ana degiskenimiz olsun
         */

        if (cinsiyet == 'k' || cinsiyet == 'K') {
            //giris yapilan deger bir kadina aittir.
            if (yas < 15) {
                System.out.println("hatali yas giris");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin, daha : " + (60 - yas) + " yil calismalisin");
            } else {
                System.out.println("emekli oalbilirsin");
            }

        } else if (cinsiyet == 'e' || cinsiyet == 'E') {
            // giris yapılan deger bir erkege aittir.
            if (yas < 15) {
                System.out.println("hatali giris");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin, daha : " + (60 - yas) + " yil calismalisin");
            } else {
                System.out.println("emekli oalbilirsin");
            }

        } else{
                    System.out.println("yalnıs cinsiyet girisi");
                }
            }
        }


