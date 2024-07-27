package Ders06_IfElseStatements;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        -kullanicidan cinsiyetini ve yasini alin, kadin,60 , yas ve uzeri, erkek 65 yas ve uzeri emeklileri
        "emekli olabilirsin"  veya "emekli olmak için ... yil daha calisman gerekir" yazdirin.
         */

        char cinsiyet= 'K';
        int yas= 6;

        if (cinsiyet=='E' && yas>=65){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='E' && yas<65 && yas>15) {
            System.out.println("Emekli olmak icin " + (65 - yas) + " sene daha calısman gerekir");
        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K' && yas<60 && yas>15) {
            System.out.println("Emekli olmak icin" + (60-yas) + " sene daha calısman gerekir");
            
        }else {
            System.out.println("gecersiz giris");
        }
    }

    }
