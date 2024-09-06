package Ders33_InheritanceDatatypeKullanimi_Overriding;

public class FAvcuKuslar extends EKuslar{

    public void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme(){
        System.out.println("Avci kuslar et yerler");
    }
    public void pence(){
        System.out.println("Avci kuslar pencelidir");
    }
    public void gaga(){
        System.out.println("Avci kuslar sivri gagalidir");
    }

    public static void main(String[] args) {

        FAvcuKuslar avci1=new FAvcuKuslar();

        /*
            Bir obje olusturulurken constructor ve data turu ayni ise
            hangi method'un gecerli oldugunu bulmak icin o class'a gider
            varsa kullaniriz yoksa sirasi ile parent'lara gider
            ilk buldugumuzu kullaniriz.
         */

        avci1.beslenme(); // Avci kuslar
        avci1.gaga();     // Avci kuslar
        avci1.pence();    // Avci kuslar
        avci1.hareket();  // Avci kuslar
        avci1.cogalma();  // Kuslar
        avci1.kanat();    // Kuslar
        avci1.omru();     // Hayvanlar
        avci1.solunum();  // Kuslar

        EKuslar avci2=new FAvcuKuslar();

        /*
            Bir obje olusturulurken data turu ile constructor farkli ise
            hangi method'un gecerli olucagini bulmak icin

            Once data turunun oldugu class ve parent'larina bakarak o method'u
            buluruz
            bulamazsak CTE verir

            bulursak hemen calistirmayiz
            calistirmadan once override edilmis mi diye kontrol ederiz
            override edilmisse override eden methodu calistiririz.
         */

        avci2.beslenme(); // Avci kuslar
        avci2.gaga();     // Avci kuslar
        // avci2.pence();    // CTE
        avci2.hareket();  // Avci kuslar
        avci2.cogalma();  // Kuslar
        avci2.kanat();    // Kuslar
        avci2.omru();     // Hayvanlar
        avci2.solunum();  // Kuslar

        DHayvanlar avci3=new FAvcuKuslar();

        avci3.beslenme(); // Avci kuslar
        // avci3.gaga();     // CTE
        // avci3.pence();    // CTE
        avci3.hareket();  // Avci kuslar
        avci3.cogalma();  // Kuslar
        // avci3.kanat();    // CTE
        avci3.omru();     // Hayvanlar
        avci3.solunum();  // Kuslar

        EKuslar kus1=new EKuslar();

        kus1.cogalma(); // Kuslar
        kus1.gaga();    // Kuslar
        kus1.kanat();   // Kuslar
        kus1.hareket(); // Hayvanlar
        kus1.solunum(); // Kuslar
        kus1.beslenme();// Hayvanlar
        kus1.omru();    // Hayvanlar

        /*
            Methodlar'la belirlenen ozellikler en guncel bilgiyi alirken

            variable ile belirlenen ozellikler ilk buldugu degeri kullanir

            bunun icin method'lara dinamik ozellik
            variable'lara static ozellik denir.
         */


        DHayvanlar kus2=new EKuslar();

        kus2.cogalma(); // Kuslar
        // kus2.gaga();    // CTE
        // kus2.kanat();   // CTE
        kus2.hareket(); // Hayvanlar
        kus2.solunum(); // Kuslar
        kus2.beslenme();// Hayvanlar
        kus2.omru();    // Hayvanlar



    }

}
