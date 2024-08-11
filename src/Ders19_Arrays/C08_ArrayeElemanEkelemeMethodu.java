package Ders19_Arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEkelemeMethodu {
    public static void main(String[] args) {

        // verilen bir int array'e istenen bir elementi ekleyip
        // yeni halini bize donduren bir method olusturun.

        int [] abc= {3,5,8,9};
        int eklenecekSayi=1;

        abc=arrayeElemanEkle(abc,eklenecekSayi);

        System.out.println(Arrays.toString(abc)); // [3, 5, 8, 9, 1]

    }

    public static int[] arrayeElemanEkle(int [] eklenecekArr, int eklenecekSayi){

        int[] yeniArr= new int[eklenecekArr.length+1];

        for (int i = 0; i <eklenecekArr.length ; i++) {

            yeniArr[i]=eklenecekArr[i];

        }

        yeniArr[yeniArr.length-1]=eklenecekSayi;
        return yeniArr;
    }
}
