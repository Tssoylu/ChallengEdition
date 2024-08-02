package Ders13_NestedForLoops_MethodOlusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {

        String str= "Java muhtesemdir";

        // metni buyuk harfe cevir

        String buyukStr= str.toUpperCase();

        System.out.println(str); // Java muhtesemdir

        System.out.println(buyukStr); // JAVA MUHTESEMDİR

        // metni buyuk harfe cevrilmis hali S icerir mi ?

        System.out.println(buyukStr.contains("S")); // true

    }
}
