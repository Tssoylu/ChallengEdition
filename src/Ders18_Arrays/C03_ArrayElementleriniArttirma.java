package Ders18_Arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniArttirma {
    public static void main(String[] args) {

        // Soru- Verilen bir int array'İn tum elemanlarini 2 arttrip bize donduren bir method olsuturun.
        // Eski array'i yeni haliyle kaydedin.


        int[] arr={2,4,6,8};

        for (int i = 0; i < arr.length ; i++) {
            arr[i]= arr[i]+2;

        }
        System.out.println(Arrays.toString(arr)); // [4, 6, 8, 10]

        arr= elementleri2Arttir(arr);

        System.out.println(Arrays.toString(arr)); // [6, 8, 10, 12]
    }

    public static int[] elementleri2Arttir (int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = arr[i] + 2;

        }
        return arr;

    }
}
