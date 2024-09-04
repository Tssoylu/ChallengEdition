package Ders30_Encapsulation;

public class C01_Encapsulation {
    public static void main(String[] args) {

        AEncapsuleClass pers1= new AEncapsuleClass();

        // pers1.hastaneAdi="Java Hastanesi"; privat oldugu icin gorulmez
        // pers1.hastaUcreti="10000"; goremeyiz cunku privar

        // pers1.hemsireAdresi="Ankara"; privat oldugundan ulasilamaz
        // pers1.hemsireIsmi="Yildiz Yildiz"; privat oldugundan ulasilamaz

        System.out.println(pers1.getHastaneIsmi()); // Yildiz Hastanesi
        pers1.setHastaUcreti(500);

        // getter ve setter method'lari
        // bazen de erisimi sinirlandirmak icin degil
        // kullanicilarin islevi iyi anlamasi icin kullanilir.


        System.out.println(pers1.getHemsireAdresi()); // null
        pers1.setHemsireAdresi("Istanbul");
        System.out.println(pers1.getHemsireIsmi()); // nul


    }
}
