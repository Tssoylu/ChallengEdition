package Ders06_IfElseStatements;
import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        /*
        -kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        ucgen eskenar ise "Eskenar ucgen " yazidrin ,degilse "Eskenar degil" yazidirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz.");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eskenar ucgendir.");
        } else{
                System.out.println("Eskenar degildir.");
            }
        }
 }

