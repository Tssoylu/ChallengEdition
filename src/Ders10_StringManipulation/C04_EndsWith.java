package Ders10_StringManipulation;

public class C04_EndsWith {
    public static void main(String[] args) {

        String str= "Java heryerde guzel";

        System.out.println(str.endsWith("guzel")); // true

        System.out.println(str.endsWith("")); // ture

        System.out.println(str.endsWith("Java heryerde guzel")); // true

        System.out.println(str.endsWith("Java")); // false


    }
}
