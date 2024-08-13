package Ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {
    public static void main(String[] args) {


        List<Integer> sayilar= new ArrayList<>();
        System.out.println(sayilar); // [ ]

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        System.out.println(sayilar.add(10)); // true
        System.out.println(sayilar); // [10, 20, 30]

        // tersi soylenmedikce elementi sona ekler

        sayilar.add(1,15);

        System.out.println(sayilar); // [10, 15, 20, 30, 10]

        // listenin basina 44 ekleyin

        sayilar.add(0,44);

        System.out.println(sayilar); // [44, 10, 15, 20, 30, 10]

        List<Integer> eklenecekListe = new ArrayList<>();

        eklenecekListe.add(3);
        eklenecekListe.add(5);

        // sayilar listesinin sonuna eklencek listeyi ekleyin

        sayilar.addAll(eklenecekListe);

        System.out.println(sayilar); // [44, 10, 15, 20, 30, 10, 3, 5]

        // sayilar listesinin basindaki 44'den sonraya eklenecek listeyi ekleyin

        sayilar.addAll(1,eklenecekListe);

        System.out.println(sayilar); // [44, 3, 5, 10, 15, 20, 30, 10, 3, 5]

    }
}
