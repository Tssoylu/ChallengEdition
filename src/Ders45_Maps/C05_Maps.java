package Ders45_Maps;

import Ders44_Maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        ogrenciMap.put(110,"Suleyman-Sah-11-T-MF");
        ogrenciMap.put(105,"Sule-Karaca-10-L-MF");


        // ogrenci map'inden numara isim ve soyisim degerlerini yazdiralim

        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);
    }
}
