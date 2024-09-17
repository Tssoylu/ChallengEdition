package Ders44_Maps;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {


        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();

        // 7. satirdan sonra map uzerindeki yapicagimiz her degisiklik
        // bu class'daki ogrenci map'i etkiler

        // map'in bu halini gorelim
        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz}
         */

        // map'e 1 tane yeni element ekleyelim
        ogrenciMap.put(110,"Fatih-Yan-10-T-MF");

        // 102 numarali ogrenciyi update edelim
        ogrenciMap.put(102,"Veli-Dem-12-B-Soz");
        System.out.println(ogrenciMap);

        // 103 nolu ogrencinin isim ve soyismini yazdirin
        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap, 103));

        // 105 numarali ogrencinin subesini T yapin
        MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,105,"T");
        System.out.println(ogrenciMap);
        /*
        {
        101=Ali-Can-10-H-MF,
        102=Veli-Dem-12-B-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-T-TM,
        106=Fatma-Han-10-K-Soz,
        110=Fatih-Yan-10-T-MF}

         */
    }
}
