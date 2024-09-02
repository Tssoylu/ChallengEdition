package Ders28_VaragsStringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder(7);

        // bu kod yazildiginda java 7 karakter alabilicek bir sb olusturur

        System.out.println(sb.capacity()); // 7
        System.out.println(sb.length()); // hicbir deger atanmadigi icin 0 verir


        sb.append("Java");

        System.out.println(sb); // Java
        System.out.println(sb.capacity()); // 7
        System.out.println(sb.length()); // 4

        sb.append(" Guzeldir.");

        System.out.println(sb); // Java Guzeldir
        System.out.println(sb.capacity()); // 7* 2 + 2 =16
        System.out.println(sb.length()); // 14

        sb.append(" Ona ne suphe");

        System.out.println(sb); // Java Guzeldir Ona ne suphe
        System.out.println(sb.capacity()); // 34
        System.out.println(sb.length()); // 27

        // kapasite ve lengt'i esitlemek icin

        sb.trimToSize();
        System.out.println(sb.capacity()); // 27
        System.out.println(sb.length()); // 27

    }
}
