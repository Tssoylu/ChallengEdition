package Ders11_StringManipulation;

public class C02_Replace {
    public static void main(String[] args) {

        String str="Java candir";

        System.out.println(str.replace('a', 'A')); // JAvA cAndir

        System.out.println(str.replace(' ', '_')); // Java_candir

        System.out.println(str.replace("candir","cok guzeldir.")); // Java cok guzeldir.

        System.out.println(str.replace(" ", "")); // Javacandir

        // String'deki a'larin hepsini silin.
        System.out.println(str.replace("a", "")); //Jv cndir

        // Java yerine hava, candir yerine cok guzel yazdirin
        System.out.println(str.replace("Java","Hava")
                .replace("candir","cok guzel")); // Hava cok guzel

        System.out.println(str.replace("","_")); // _J_a_v_a_c_a_n_d_i_r_

        // sadece 1. a'yi A yapin
        System.out.println(str.replaceFirst("a","A")); // JAva candir







    }
}
