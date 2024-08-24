package Ders26_PassByValue_ImmutableClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_PassByValueArray2 {
    public static void main(String[] args) {

        // Bir method olusturun
        // Sayilar array'inin uzunlugundan 2 fazla olan
        // Ve elementlerin tamami 5 olan yeni bir array olsuturup
        // Deger olarak sayilar array'ine atayin ve sayilar array'ini yazidirin


        int[] sayilar = {3, 4, 5, 6};
        arrayeYeniDegerAta(sayilar);

        System.out.println(Arrays.toString(sayilar));
    }

    public static void arrayeYeniDegerAta (int[] sayilar){

        int [] yeniArray = new int[sayilar.length+2];

        for (int i = 0; i <yeniArray.length ; i++) {
            yeniArray[i]=5;
        }

        sayilar=yeniArray;
        System.out.println("Methodla sayilarin son hali : " + Arrays.toString(sayilar));
    }
}
