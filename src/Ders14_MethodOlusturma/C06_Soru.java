package Ders14_MethodOlusturma;

public class C06_Soru {

    /*
    - kullanicidan main method icinde isim ve soyismi ayri ayri alin
      isim ve soyismin ilk harflerini buyuk digerlerini kucuk olucak sekilde duzenleyip,
      isim bosluk soyisim seklinde bize donduren bir method olusturun
      input : isim : Ali soyisim : YILMAZ. output : Ali Yilmaz

     */

    public static void main(String[] args) {

        String isim = "OMER";
        String soyisim = "Kesen";
        System.out.println(isimsoyisimDuzenle(isim, soyisim)); // Omer Kesen
        System.out.println(isimsoyisimDuzenle("hEYSEM", "RENKOGLU")); // Heysem Renkoglu


    }

    public static String isimsoyisimDuzenle(String isim, String soyisim) {

        String yenIsimSoyisim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase() +
                " " +
                soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).toLowerCase();
        return yenIsimSoyisim;
    }
}
