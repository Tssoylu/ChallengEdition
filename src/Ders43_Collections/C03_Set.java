package Ders43_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {

        // verilen bir array'in tekrar eden elementlerini
        // silip her elementin sadece bir kere kullanildigi hale getirin


        int [] arr = {3,4,6,8,3,4,5,7,9,9,2,1,6,2,1,};

        Set<Integer> geciciSet= new HashSet<>();

        for (Integer each : arr
        ){
            geciciSet.add(each);

        }

        arr = new int[geciciSet.size()]; // eski array'e yeni boyut tanimladik ( 9 uzunlugunda )

        // Sett'deki benzersiz hale getirilen elementleri gecici array'e tasiyalim

        int index=0;
        for (Integer each : geciciSet
        ){
            arr[index]=each;
            index++;

        }

        // tekrarsiz gecici arr'e tasidik
        // simdi kendi array'imize bu gecici arr degerini atayalim



        System.out.println(Arrays.toString(arr));
    }
}
