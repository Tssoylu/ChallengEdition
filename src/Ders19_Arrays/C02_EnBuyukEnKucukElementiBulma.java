package Ders19_Arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {

        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun.

        int [] arr = {3,8,1,5,2,9};

        enBuyukEnKucukElemenYazdir(arr);

    }

    public static void enBuyukEnKucukElemenYazdir(int [] arr){

        Arrays.sort(arr); // [1, 2, 3, 5, 8, 9]

        System.out.println("En buyuk element : " + arr[arr.length-1]);
        System.out.println("En kucuk element : " + arr[0]);
    }
}
