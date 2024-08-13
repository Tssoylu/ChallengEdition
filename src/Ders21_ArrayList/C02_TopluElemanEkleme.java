package Ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElemanEkleme {
    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();

        // tum sesli harfleri listeye ekleyin
        // eklenecek tum elementleri bir array olarak yazip
        // sonra for loop ile liste ekleyebiliriz


        String [] arr= {"a","e","i","o","u"};

        for (int i = 0; i <arr.length ; i++) {

            harfler.add(arr[i]);
            
        }

        System.out.println(harfler); // [a, e, i, o, u]

        System.out.println(harfler.size()); // 5  - uzunlugunu bulmak icin

        System.out.println(harfler.isEmpty()); // false - bos mu degil mi icin
    }
}
