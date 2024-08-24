package Ders25_StaticKeyword;

public class C04_PassByValue {

    public static void main(String[] args) {

        double fiyat = 100;

        System.out.println(indirimuygule(fiyat)); // 90
        System.out.println(indirimuygule(fiyat)); // 90
        System.out.println(indirimuygule(fiyat)); // 90

        System.out.println(fiyat); // 100
    }

    private static double indirimuygule(double fiyat) {

        // %10 inidirmli fiyat

        fiyat = fiyat * 0.9; // fiyata atama yaptik kalici olarak 90 oldu

        return fiyat;
    }
}
