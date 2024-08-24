package Ders26_PassByValue_ImmutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {

        double fiyat = 100;

        System.out.println(indirimuygule(fiyat)); // 90
        System.out.println(indirimuygule(fiyat)); // 90
        System.out.println(indirimuygule(fiyat)); // 90

        System.out.println(fiyat); // 100

        fiyat = indirimuygule(fiyat);

        System.out.println(" Indirin uygulanmis yeni fiyat : " + fiyat); // 90
    }
    /*
    kodlarimizin anlasilir olmasi icin main method'dan diger methodlara
    parametre olarak gonderdigimiz variable'lar icin ayni isimli variable
    olusturmayi tercih ederiz.

    Java methodlar arasinda gecis yaparken variable'i degil
    variable'nin value'sunu pass eder.

    Bu Java'nin Pass By Value'yu tercih etmesindendir.


    Eger method'un icerisinde yaptigimiz degisikligin
    main method icin de gecerli olmasini istersek
    main method icerisinde :

    fiyat = indirimuygule(fiyat);

    atamasi yapabiliriz.
     */

    private static double indirimuygule(double fiyat) {

        // %10 inidirmli fiyat

        fiyat = fiyat * 0.9; // fiyata atama yaptik kalici olarak 90 oldu

        return fiyat;
    }
}
