package Ders19_Arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {

        String str= "java gercekten cok cok guzel";


        // verilen Str'da kac tane e harfi oldugunu bulunuz.


        String[] eArryi = str.split("e");

        System.out.println(Arrays.toString(eArryi)); // [java g, rc, kt, n cok cok guz, l]
        System.out.println(eArryi.length); // 5

        System.out.println("Metindeki e sayisi : " + (eArryi.length-1)); // Metindeki e sayisi : 4


        // 2. yontem
        // String'i "" ile spilit yaparak karakterilerini ayiralim.

        String [] tumKarakterlerArr = str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr)); // [j, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]

        int sayac=0;
        // bir loop ile tum karakterleri kontrol edelim

        for (int i = 0; i < tumKarakterlerArr.length; i++) {

            if (tumKarakterlerArr[i].equals("e")){
                sayac++;
            }

        }
        System.out.println("Metindeki e sayisi : " + sayac); // Metindeki e sayisi : 4
    }
}
