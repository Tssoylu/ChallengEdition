package Ders10_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1= "Java";
        String str2= "Guzeldir";
        boolean bl= true;
        int sayi= 20;
        double dbl= 3.54;

        System.out.println(str1+bl+sayi); // Javatrue20

        // System.out.println(bl+sayi);
        // String disındaki data turlerini toplama yamamamiza izinvermeyebilir.

        System.out.println(sayi+dbl); // 23.54

        //System.out.println(str1.concat(bl));
        // Concat() methodu sadece String variable'lari birlestirmek icin kullanilir.


        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir





    }
}
