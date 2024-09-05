package Ders31_Inheritance;

public class GCorolla extends FToyota{

    String model="Corolla";
    String uretimYeri="Turkiye";


    GCorolla(){
        super();
        System.out.println("Corolla contructor calisti");
    }


    public static void main(String[] args) {

        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.marka); // Toyota


        /*
         bir child class'da obje olusturdugumuzda olusturulan obje sadece child class'a ait ozellikleri degil
         tum parent calss'larindaki ozellikleri de tasir

         bir objenin bir class'in ozelliklerini tasimasi icin
         o obje olusturulurken class'a ait constructor'in calismis olmasi gerekir
         yani child class'indaki obje olusturulurken tum parent class'lardaki constructor'lar da calisir

         Java bu islem icin soyle bir mekanizma gelistirmistir
         bir class olsuturdugumuzda biz constructor olusturmasak da
         Java'nin o class'a default constructor koydugu gibi
         extends keyword kullanan bir class'da olsuturulan her bir constructor'in ilk satirina
         biz gormesek de super() constructor call koyar

         */
    }


}
