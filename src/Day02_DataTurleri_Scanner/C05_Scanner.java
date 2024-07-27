package Day02_DataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir doubleö bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz");

        double ondalikliSayi= scan.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz");
        int tamSayi= scan.nextInt();

        System.out.println("Girilen sayilarin toplami: " + (ondalikliSayi+tamSayi));

        System.out.println("Girilen sayilarin carpimi: " + (ondalikliSayi*tamSayi));


    }
}
