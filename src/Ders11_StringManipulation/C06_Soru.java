package Ders11_StringManipulation;

public class C06_Soru {
    public static void main(String[] args) {

        /* kullanicidan bir cumle alin
        cumlede "ev" geciyorsa "home sweet home" yazdirin
        cumlede "is" geciyorsa "calismak guzeldir" yazdirin
        cumlede hem "ev" hem "is" geciyorsa "hem ev hem is" yazdirin
        ikisi de gecmiyorsa "cok calisman lazim"
         */

        String cumle= "Amcama geldim merdiven curumus";

        String cumleCopy= cumle.toLowerCase();


    if (cumleCopy.contains("ev") && cumleCopy.contains("is")){
            System.out.println("Hem ev lazim hem is");
        } else if (cumleCopy.contains("ev")) {
            System.out.println("Home home sweet home");
        } else if (cumleCopy.contains("is")) {
        System.out.println("Calismam guzeldir");
    }else {
        System.out.println("Cok calismak lazim");
    }

    }
}
