package Day02_DataTurleri_Scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan ikis sayi alip ikinin degerlerini degistirin(swap).

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen 1.tam sayiyi giriniz");
        int sayi1= scan.nextInt();

        System.out.println("Lutfen 2.tam sayiyi giriniz");
        int sayi2= scan.nextInt();

        int bos;

        bos=sayi2;

        sayi2=sayi1;

        sayi1=bos;

        System.out.println("sayi1'in degeri : " + sayi1);
        System.out.println("sayi2'in degeri : " + sayi2);


        
    }
}
