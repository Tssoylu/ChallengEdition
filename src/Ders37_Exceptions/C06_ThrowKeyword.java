package Ders37_Exceptions;

import java.util.Scanner;

public class C06_ThrowKeyword {
    public static void main(String[] args) {

        // Kullanicidan yasini isteyin
        // eger negatif 0 veya negatif sayi girerse uyari olarak
        // IllegalArgumentException uyarisi verin
        // ancak kodumuz calismaya devam etsin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        try {
            if (yas<=0){

                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Yas 0 veya negatif Olamaz");
        }
    }
}
