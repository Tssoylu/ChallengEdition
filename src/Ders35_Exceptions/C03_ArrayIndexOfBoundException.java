package Ders35_Exceptions;

import java.lang.reflect.Array;
import java.util.Scanner;

public class C03_ArrayIndexOfBoundException {
    public static void main(String[] args) {

        // kullanicidan bir index isteyin
        // verilen bir array'den kullanicinin giridigi index'deki elementi yazdirin

        int [] arr={1,2,3,4,5,6,7,8,9,1};

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir index giriniz");
        int index= scan.nextInt();


        try {

            System.out.println(arr [index]);

        } catch (ArrayIndexOutOfBoundsException hata) {


            // System.out.print(hata.getMessage()); // Index 12 out of bounds for length 10
            // hata.printStackTrace();
            // java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
            //	at Ders35_Exceptions.C03_ArrayIndexOfBoundException.main(C03_ArrayIndexOfBoundException.java:21)
            // Java'nin yazdigi tum hatalari yazdirir ama kodlar calismaya devam eder

            // catch blogunda hicbir kod olmasa da kodlarimiz normal calismaya devam eder
            // catch blogoun'da kullaniciya yazdiracagim mesaj
            // tamamen kod yazanin insiyatifindedir
            // exception class'inda hazir hata mesajlari da yazdirabilir
            // kendi istedigi kodlari da calisabilir
            // hic bir sey yazmaya da bilir



        }


    }
}
