package Ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        -kullanicidan kilo ve bouyunu isteyip vucut kitle endeksini hesaplayin
        -(kilo*10000/(boy*boy)
        -vucut kitle endeksi 30'dan buyukse obez,
        -20-30 arasi ise kilolu,
        -20'den kucukse zayif yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu girinz");
        double agirlik= scan.nextDouble();
        System.out.println("cm olarak boyunuzu giriniz");
        double boy= scan.nextDouble();

        double vke= (agirlik*10000/(boy*boy));
        System.out.println("Vucut kitle endeksiniz : " + vke);

        if (vke>30) {
            System.out.println("Obez");
        } else if (vke>25) {
            System.out.println("Kilolu");
        } else if (vke>20) {
            System.out.println("Normal");
        } else if (vke>0) {
            System.out.println("Zayif");
        }else {
            System.out.println("Yalnıs giris");
            
        }
    }
    }