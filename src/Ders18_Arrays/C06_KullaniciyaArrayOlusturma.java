package Ders18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {

        // Soru- Kullanicidan array'in boyutunu
        // ve elementleri alip array'i olusturan
        // ve bize donduren bir method yazdirin.

        int[] kulleniciArrayi= arrayOlustur();
        System.out.println(Arrays.toString(kulleniciArrayi));

    }

    public static int[] arrayOlustur(){

        Scanner scan= new Scanner(System.in);
        System.out.println("Olusturulacak array'in boyutunu giriniz");

        int lenght= scan.nextInt();

        int [] kullaniciArrayi = new int[lenght];

        for (int i = 0; i <lenght ; i++) {
            System.out.println("Array'e eklenicek bir sayi giriniz");
            kullaniciArrayi[i] = scan.nextInt();
        }
        return kullaniciArrayi;


    }
}
