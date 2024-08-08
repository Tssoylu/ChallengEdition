package Ders17_Scope;

import java.util.Scanner;

public class C05_ObjectVariables {

    public static void main(String[] args) {

        // C03 class'indaki intance variable'lara nasil ulasabiliriz ?
        // instance variable'larin diger adi obje variable'laridir
        // instance variable'lara obje uzerinden ulasabiliriz


        C03_ObjectVariables personel1= new C03_ObjectVariables();

        System.out.println(personel1.persIsmi); // Isim girilmedi
        System.out.println(personel1.persYasi); // 0

        personel1.persIsmi= "Suleyman";
        personel1.persYasi= 35;
        personel1.persTelefonu= "555 346754";

        System.out.println(personel1.persIsmi); // Suleyman
        System.out.println(personel1.persYasi); // 35

        C03_ObjectVariables personel2 = new C03_ObjectVariables();

        personel2.persIsmi= "Latife";
        personel2.persYasi= 32;
        personel2.persTelefonu= "555 4322321";

        System.out.println(personel1.persIsmi); // Suleyman
        System.out.println(personel2.persIsmi); // Latife

        C03_ObjectVariables personel3 = new C03_ObjectVariables();

        personel3.persIsmi= "Heysem";
        personel3.persYasi= 30;
        personel3.persTelefonu= "321 3132321";

        System.out.println(personel1.persYasi); // 35
        System.out.println(personel2.persYasi); // 32
        System.out.println(personel3.persYasi); // 30
    }
}
