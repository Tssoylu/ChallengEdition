package Ders18_Arrays;

import java.util.Arrays;

public class C04_ArrayElementleriToplama {
    public static void main(String[] args) {

        int[] arr={3,-3,5,-7,-6,1,-2};

        System.out.println(PozitifElementleriTopla(arr)); // 9

    }

    public static int PozitifElementleriTopla(int [] arr){

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] >0) {

                toplam += arr[i];
            }

        }
        return toplam;
    }

}
