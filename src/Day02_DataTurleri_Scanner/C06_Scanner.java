package Day02_DataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin 2 kenar uzunlugunu girin" +
                "\niki kenar uzunlugu arasinda enter'a basin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Dikdortgenin alani " + (kenar1*kenar2));

    }
}
