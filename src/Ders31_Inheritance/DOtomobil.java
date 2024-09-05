package Ders31_Inheritance;

public class DOtomobil extends BinekArac {
    public static void main(String[] args) {

        DOtomobil oto1=new DOtomobil();
        System.out.println(oto1.marka);

        // Inheritance sayesinde bir child klass olusturdugumuzda
        // yeni hicbir variable veya method olusturmadan
        // parent calss'lardaki tum ozellikleri almis oluruz
        // child class'da parent'dan gelen tum ozellikleri
        // update edebilir veya yeni ozellikler ekleyebiliriz.

    }
}
