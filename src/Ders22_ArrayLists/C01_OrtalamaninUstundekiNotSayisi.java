package Ders22_ArrayLists;

import jdk.dynalink.NamedOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotSayisi {
    public static void main(String[] args) {

        // Ortalamanin ustundeki notlari alip bir list olsuturun
        // Ogretmen 100 den buyuk sayi girdiginde bitirip
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        List<Double> notlar= listeOlustur();
        System.out.println(notlar);

        raporla(notlar);
    }

    private static void raporla(List<Double> notlar) {
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        int ogrenciSayisi=notlar.size();
        double notlarToplami=0.0;
        double sinifNotOrtalamasi=0.0;
        int ortalamaUstundekiOgrenciSayisi=0;

        // Notlar toplamini bulalim

        for (int i = 0; i <notlar.size() ; i++) {

            notlarToplami+= notlar.get(i);

        }

        // not ortalamasini bulalim

        sinifNotOrtalamasi= notlarToplami/ogrenciSayisi;

        // ortalama ustundeki ogrenci sayisini bulalim

        for (int i = 0; i <notlar.size() ; i++) {

            if (notlar.get(i)>sinifNotOrtalamasi){

                ortalamaUstundekiOgrenciSayisi++;
            }
            
        }

        // rapor icin istenenleri yazdiralim
        System.out.println("Girilen not sayisi : " + ogrenciSayisi+
                           "\nGirilen notlarin ortalamasi : " + sinifNotOrtalamasi+
                           "\nOrtalama uzerinde not alan ogrenci sayisi : " + ortalamaUstundekiOgrenciSayisi);


    }


    public static List<Double> listeOlustur() {

        List<Double> notlar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Double girilenNot = (double) 5;

        while (girilenNot <= 100) {

            System.out.println("Lutfen listeye eklemek icin not giriniz" +
                    "\nBitirmek icin 100'den buyuk bir sayi yazin");
            girilenNot = scan.nextDouble();

            if (girilenNot <= 100) {
                notlar.add(girilenNot);
            }
        }

        return notlar;
    }
}