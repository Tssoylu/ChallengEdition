package Ders42_Collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1= new LinkedList<>();

        ll1.add("K");

        ll1.add("T");



        // Linked list uc tane interface'i implements etmistir
        // List, Queue, Deque interfaceleri
        // Dolayisiyla bu interface'lerden sonra gelen ilk concrete class oldugundan
        // Bu uc interface'deki tum abstract method'lari override etmistir

        // Linked list olusturulurken secilen data turune gore
        // bu uc interface'den birinin ozelliklerini alabilir
        // veya data turu Linked list secilirses uc interface'in ozelliklerini de toptan alir.

        List<String> ll2= new LinkedList<>();

        // Daha onceden array list olustururken list interface'ini data turu olarak kullandigimizdan
        // bu sekilde olusturulan linked list'lerin ozelliklerini biliyoruz.

        ll2.add("R"); // [R]

        ll2.add("Z"); // [R, Z]

        ll2.add(0,"A"); // [A, R, Z]

        ll2.addAll(2,ll1); // [A, R, K, T, Z]

        ll2.set(3,"M"); // [A, R, K, M, Z]

        ll2.add("K");

        ll2.add("T");

        System.out.println(ll2); // [A, R, K, M, Z, K, T]

        System.out.println(ll2.get(1)); // R

        System.out.println(ll2); // [A, R, K, M, Z, K, T]

        System.out.println(ll2.retainAll(ll1));

        System.out.println(ll2); // [K, K, T]

        ll2.add("A");

        System.out.println(ll2.hashCode()); // 3232590  [K, K, T, A]

        // System.out.println(ll2.get(4)); // Exc

        System.out.println(ll2.subList(2, 4)); // [T, A] 2 dahil, 4 olmadigindan Exception firlatmaz




    }
}
