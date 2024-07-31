package Ders09_StringManipulations;

public class C04_CharAt {
    public static void main(String[] args) {

        String str= "Java Candir";

        System.out.println(str.charAt(0)); // ilk harfi verir J
        System.out.println(str.charAt(5)); // 5. indexteki char'i verir C

        System.out.println(str.charAt(10)); // bana sonuncu karakteri yazdirin

        /*
        bir metindeki karakter sayisi ile son index arasinda 1 fark vardir.
        bu metin icin karakter sayisi 11 ama son index 10 dur
         */

        // System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException hatasi verir




    }
}
