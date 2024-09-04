package Ders29_StringBuilderAccessModifier;

public class C04_AccessModifier {


        String isim = "Ali"; // Access modifier gorunmuyor, ozaman default access modifier gecerlidir.
                             // bu class'dan ve ders29 package'i icerisindeki diger class'dan kullanilabilir.

        // default_int sayi=10;  default access modifier yazilmaz, yazilamaz.
        //                       yazmaya kalkisirsak java CTE verir.


    private static int sayi=10;


    public static void main(String[] args) {

        System.out.println(sayi); // 10;

        sayi=20;

        System.out.println(sayi); // 20
    }
}
