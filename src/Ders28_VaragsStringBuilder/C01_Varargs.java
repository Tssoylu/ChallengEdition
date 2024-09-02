package Ders28_VaragsStringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        topla(5,6); // 11
        topla(5,3,8); // 16
        topla(2,4,6,8); // 20

        // parametre sayisi arttikca bizden yeni method olusturmamız istenir.
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("4 sayi'nin toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 sayi'nin toplami : " + (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {

        System.out.println("2 sayi'nin toplami : " + (sayi1+sayi2));
    }
}
