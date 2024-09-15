package Ders42_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataTuru {
    public static void main(String[] args) {

        Queue<String> q1= new LinkedList<>();

        q1.add("H");
        q1.add("Y"); // // [H, Y]

        System.out.println(q1);

        q1.offer("K"); // [H, Y, K]

        // kapasite sinirlamasi yapmadigimiz surece add() ile ayni islemi yapar.

        System.out.println(q1.remove()); // H
         // Queue eklemeyi sona yapip kullanmayi bastan yaptigi icin
        // parametre girmedigimizde basdaki elemani remove eder ve bize dondurur.

        System.out.println(q1); // [Y, K]

        System.out.println(q1.remove("K")); // true

        q1.remove(); // bos queue kaldı []

        // q1.remove(); // NoSuchElementException verir liste bos oludug icin

        System.out.println(q1.poll()); // null
        // q1.poll() remove() ile ayni islevi yapar
        // yani bastaki elementi siler ve bize dondurur
        // aralarindaki arm bos queue'da calistiklarinda
        // remove() exception firlatirken poll() null output verir


        q1.add("H");
        q1.add("Y"); // // [H, Y]


        System.out.println("peek : " + q1.peek()); // H
        // silmeden queue'nun basindaki elementi bize getirir
        // eger queue bossa null getirir

        System.out.println("element : " + q1.element()); // H
        //



        q1.clear(); // listeyi bosalltik

        System.out.println("peek : " + q1.peek()); // null
        // System.out.println("element : " + q1.element()); // NoSuchElementException

        
    }
}
