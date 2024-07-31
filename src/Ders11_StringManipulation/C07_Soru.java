package Ders11_StringManipulation;

public class C07_Soru {
    public static void main(String[] args) {

        /*
        - Soru: kullanicidan isim ve soyisimini ayri ayri alin
        isim daha uzun ise, isim ve soyismin ilk harf buyuk kalanlar kucuk sekilde yazdirin
        soyisim daha uzun ise, ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harfle yazdirin
         */

        String isim="MEHmEt";
        String soyisim="HAruNGIl";
        String yeniIsimSoyisim;

        if (isim.length()>soyisim.length()){
            // isim ve soyismin ilk harf buyuk kalanlar kucuk sekilde yazdirin

                   yeniIsimSoyisim= isim.substring(0,1).toUpperCase()+
                                    isim.substring(1).toLowerCase()+
                                    " "+
                                    soyisim.substring(0,1).toUpperCase()+
                                    soyisim.substring(1).toLowerCase();
        }else {
            // ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harfle yazdirin
            yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " "+
                            soyisim.toUpperCase();
        }
        System.out.println(yeniIsimSoyisim);
    }
}
