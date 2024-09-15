package Ders43_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String> dq1= new LinkedList<>();

        dq1.add("K");
        dq1.add("B"); // [K, B]

        dq1.addLast("F"); // [K, B, F]
        dq1.addFirst("A"); // [A, K, B, F]

        System.out.println(dq1.getFirst()); // A
        System.out.println(dq1.getLast()); // F

        System.out.println(dq1.remove()); // A
        System.out.println(dq1.poll()); // K
        System.out.println(dq1.removeLast()); // F
        System.out.println(dq1.remove()); // B artik Deque bos

        // System.out.println(dq1.remove()); // NoSuchElementException
        System.out.println(dq1.poll()); // null
        // bos deque olmasina ragmen exception firlatmaz, eleman silemedigi icin bize null dondurur.

        dq1.add("K");
        dq1.add("B");

        dq1.push("F"); // [F, K, B]
        // deque'in basina element ekler,
        // eger deque ile ilgili sinirlandirma varsa ve yer kalmamissa
        // IllegalStateException verir.


        System.out.println(dq1.pop()); // F
        // ilk elementi siler ve bize dondurur, removeFirst() ile ayni islemi gorur


        System.out.println(dq1.element()); // K
        // ilk elementi silmeden bize dondurur . Bos deque'de calisirsa exception firlatir

        System.out.println(dq1.peek()); // K
        // ilk elementi silmeden bize dondurur . Bos deque'de calisirsa null dondurur

        System.out.println(dq1.peekFirst()); // K
        System.out.println(dq1.peekLast()); // B

        System.out.println(dq1.offer("C")); // true liste ===> [K, B, C]
        System.out.println(dq1.offerFirst("M")); // true liste ===> [M, K, B, C]



        System.out.println(dq1);

    }
}
