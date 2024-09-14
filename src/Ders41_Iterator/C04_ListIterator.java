package Ders41_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // iterator kullanarak liste'nin elementlerini sondan basa dogru yazdirin

        // once iterator'u sona goturelim

        ListIterator lit= sayilar.listIterator();

        while (lit.hasNext()){
            lit.next();


        }

        // simdi sondan basa gidelim , giderken elementleri yazdiralim
        while (lit.hasPrevious()){

            System.out.print(lit.previous() + " ");
        }


        // eger iteratoru nerede biraktigimizi hatirlayamazsak
        // iterator.nextIndex() ile hangi index'in oncesinde oldugumuzu gorebiliriz.

        System.out.println(" ");
        System.out.println(lit.nextIndex()); // 0

        // iterator kullanarak listenin tum elementlerini 5 arttirin

        while (lit.hasNext()){

            lit.set((Integer)lit.next()+5);

        }
        System.out.println(sayilar); // [15, 25, 35, 45]

        // iterator kullanarak 40'dan kucuk olan elementleri silin

        while (lit.hasPrevious()){

            if ((Integer)lit.previous()<40)
                lit.remove();
        }
        System.out.println(sayilar); // [45]


    }
}
