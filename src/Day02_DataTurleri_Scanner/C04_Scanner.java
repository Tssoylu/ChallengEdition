package Day02_DataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini alip, buyuk harfle yazdirin

        // 1. adim :  scan objesi olusturma
        Scanner scan= new Scanner(System.in);

        //2.adim : kullanicidan ne istedigimizi yazdirma
        System.out.println("Lutfen adinizi giriniz");

        // 3.adim : kullanicidan istedigimiz bilgilerin turune uygun bir variable olusturup
        //          scanner methodlarindan uygun olanini kullanarak alinan degeri
        //          variable atayalim
        String kullaniciAdi= scan.next();

        System.out.println(kullaniciAdi.toUpperCase());


    }
}
