package Ders47_MapsMethodlari;

import Ders44_Maps.MapDepo;

import java.util.Map;

public class C02_Contains {
    public static void main(String[] args) {

        Map<Integer,String> ogreciMap = MapDepo.ornekMapOlustur();

        System.out.println(ogreciMap);

        /*
        {
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        }

         */

        System.out.println(ogreciMap.containsKey(105)); // true
        System.out.println(ogreciMap.containsKey(111)); // false


        System.out.println(ogreciMap.containsValue(10)); // false
        System.out.println(ogreciMap.containsValue("Veli-Cem-11-M-Soz")); // true
        System.out.println(ogreciMap.containsValue("Veli-Cem-11-M-Soy")); // false


        /*
           containsValue("arananDeger") value'lerin icerisindeki bir bolumu aramaz
           value'su butun olarak aranan deger olan var mi diye bakar
         */


    }
}
