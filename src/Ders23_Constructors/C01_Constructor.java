package Ders23_Constructors;

import java.util.Scanner;

public class C01_Constructor {
    public static void main(String[] args) {


        // Scanner calss'indaki method ve variable'lari(ozellikleri) kullanmak icin Scan Objesi olsutururuz.
             Scanner     scan       =  new                            Scanner(System.in);
        //   class adi   obje ismi     obje olusturmak icin keyword   Scanner Constructor'i


        scan.nextInt();

        String str= new String("Java Candir");
        String str2 = "Java ne guzel";

        str.toLowerCase();




    }

    public static void C01_Constructor(){
        // method isimleri kucuk harfle baslar
        // klass ismi ile ayni isimde olmamasi tercih edilir
        // return type var bu method'dur, constructor olmaz.
    }
}
