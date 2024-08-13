package Ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Set {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // list.set(index, yeniDeger) method'u
        // istenen index'deki eski degeri silip bize dondurur
        // ve o index'deki degeri verdigimiz yeni deger olarak yerine atar.

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

                sayilar.add(arr[i]);
        }

        // Javada set () methodlari update icin kullanilir
        // add() ile set() farklidir


        System.out.println(sayilar.set(0, 8));
        int eskiDeger =sayilar.set(1,9);
        System.out.println(eskiDeger);
        System.out.println(sayilar); // [8, 9, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]


    }
}
