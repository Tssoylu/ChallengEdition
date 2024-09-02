package Ders28_VaragsStringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java Candir.");

        System.out.println(sb.capacity()); // 28
        System.out.println(sb.length()); // 12

        System.out.println(sb.reverse()); // .ridnaC avaJ
        System.out.println(sb.reverse()); // Java Candir.

        System.out.println(sb.replace(0,4,"Ahmet Hoca")); // Ahmet Hoca Candir.

        System.out.println(sb.insert(18,"Bu bir yalandir")); // Ahmet Hoca Candir.Bu bir yalandir

        String str= "Java cok guzel";

        sb.insert(21,str,9,14);

        System.out.println(sb); // Ahmet Hoca Candir.Bu guzelbir yalandir
    }
}
