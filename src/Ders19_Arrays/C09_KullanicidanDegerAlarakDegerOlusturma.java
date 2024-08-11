package Ders19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakDegerOlusturma {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar istedigi kadar sayi alip bir array olusturun
        // kullanici eleman girisini bitirmek icin 0'a bassin


        Scanner scan= new Scanner(System.in);
        int[] arr={0};
        int girilenSayi=0;

        do {

            System.out.println("array'e eklemek icin bir tam sayi giriniz " +
                    "\nBitirmek icin 0'a basin");
            girilenSayi= scan.nextInt();

            if (arr[0]==0){
                arr[0]=girilenSayi;
            }else if (girilenSayi!=0){
                arr=C08_ArrayeElemanEkelemeMethodu.arrayeElemanEkle(arr,girilenSayi);
            }

        }while (girilenSayi!=0);

        System.out.println(Arrays.toString(arr));
    }

}
