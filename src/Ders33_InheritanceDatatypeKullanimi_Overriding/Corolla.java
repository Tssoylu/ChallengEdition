package Ders33_InheritanceDatatypeKullanimi_Overriding;

public class Corolla extends BToyota{

    String model="Corolla";
    String unretimYeri="Turkiye";
    int yil=2023;

    public static void main(String[] args) {


        /*
           Bir obje olustururken
           data turu ve constructor ayni class'dan ise
           bir variable'in degerini bulmak icin o calss'a gideriz
           o calss'da yoksa sirasiyla parent class'lara bakilir
           ilk bulunan kullanilir.

         */


        Corolla corolla1=new Corolla();
        System.out.println(corolla1.model); // Corolla
        System.out.println(corolla1.unretimYeri); // Turkiye
        System.out.println(corolla1.yil); // 2023
        System.out.println(corolla1.marka); // Binek araclarin markasi olur
        System.out.println(corolla1.motor); // Tum Araclar Motor kullanir
        System.out.println(corolla1.plaka); // Tum Araclarin Plakasi olur
        System.out.println(corolla1.yakit); // Toyota cevreci yakit kullanir

        BToyota corolla2=new Corolla();

        /*
           Obje olusturulurken
           data turu ve costructor farkli ise
           Variable'in degerini bulmak icin
           data turu olan class'a gidilir
           varsa kullanilir yoksa o class'in parent'larina bakilir
           bulunamazsa CTE verir.
         */

        System.out.println(corolla2.model); // Binek araclarin modeli olur
        // System.out.println(corolla2.unretimYeri); // CTE verir
        System.out.println(corolla2.yil); // 1990
        System.out.println(corolla2.marka); // Binek araclarin markasi olur
        System.out.println(corolla2.motor); // Tum Araclar Motor kullanir
        System.out.println(corolla2.plaka); // Tum Araclarin Plakasi olur
        System.out.println(corolla2.yakit); // Toyota cevreci yakit kullanir




        Araba corolla3=new Corolla();

        // System.out.println(corolla3.model); // CTE verir
        // System.out.println(corolla3.unretimYeri); // CTE verir
        // System.out.println(corolla3.yil); // CTE verir
        // System.out.println(corolla3.marka); // CTE verir
        System.out.println(corolla3.motor); // Tum Araclar Motor kullanir
        System.out.println(corolla3.plaka); // Tum Araclarin Plakasi olur
        System.out.println(corolla3.yakit); // Araclar farkli yakitlar kullanirlar


        BToyota toyota1=new BToyota();
        System.out.println(toyota1.marka); // BToyota
        System.out.println(toyota1.model); // BToyota
        System.out.println(toyota1.motor); // Araba
        System.out.println(toyota1.plaka); // Araba
        System.out.println(toyota1.yil);   // BToyota
        System.out.println(toyota1.yakit); // BToyota


        Araba toyota2=new BToyota();

        // System.out.println(toyota2.marka); // CTE
        // System.out.println(toyota2.model); // CTE
        System.out.println(toyota2.motor); // Araba
        System.out.println(toyota2.plaka); // Araba
        // System.out.println(toyota2.yil);   // CTE
        System.out.println(toyota2.yakit); // Araba

        Araba araba1=new Araba();

        System.out.println(araba1.motor); // Araba
        System.out.println(araba1.plaka); // Araba
        System.out.println(araba1.yakit); // Araba


    }
}
