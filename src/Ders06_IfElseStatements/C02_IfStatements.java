package Ders06_IfElseStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*
        -kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        ucgen eskenar ise es kenar ucgen yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz.");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }
    }
}
