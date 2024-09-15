package Ders42_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {
    public static void main(String[] args) {

        // Soru- Kullanicidan deger alarak iki String List olusturalim.
        // Kullanici deger girmeyi birakmasi icin 0'a basmalidir
        // İki liste olusturduktan sonra asagidaki sekilde bir output haziralayalim
        // liste1 : ,,,,,.
        // liste2 : ,,,,,.
        // ortak elementler : ,,,,,.

        System.out.println("Once List1'i olusturalim");

        List<String> list1= kullanicidanAlarakListOlustur();

        System.out.println("Simdi ikinci listeyi olusturalim");

        List<String> list2= kullanicidanAlarakListOlustur();

        System.out.println("Liste1 : " + list1);
        System.out.println("Liste2 : " + list2);

        list1.retainAll(list2);

        System.out.println("Ortak elemanlar : " + list1 );
    }

    public static List<String> kullanicidanAlarakListOlustur(){

        // Soru- Kullanicidan deger alarak iki String List olusturup main method'a dondurelim
        // Kullanici deger girmeyi birakmasi icin 0'a basmalidir

        List<String> isimListesi= new LinkedList<>();
        Scanner scann = new Scanner(System.in);
        String isim="";

        while (!isim.equalsIgnoreCase("0")){

            System.out.println("Listeye eklemek icin isim giriniz \nBitirmek icin 0'a basiniz");
            isim= scann.nextLine();

            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);

            }
        }
        return isimListesi;
    }
}
