package Ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullaniciyaListOlusturtma {
    public static void main(String[] args) {


        // Kullanicidan istedigi kadar isim aliğ
        //  Q'ya bastiginda girdigi isimleri bize liste olarak dondurucek bir method olusturun.


        System.out.println(listeOlustur());


    }

    public static List<String> listeOlustur(){

        List<String> isimler= new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        String girilenIisim=" ";

        while (!girilenIisim.equalsIgnoreCase("q")){

            System.out.println("Lutfen listeye isim eklemek icin isim giriniz" +
                    "\nBitirmek icin q'ya basin");
            girilenIisim= scan.nextLine();

            if (!girilenIisim.equalsIgnoreCase("q")){
                isimler.add(girilenIisim);
            }
        }

        return isimler;
    }
}
