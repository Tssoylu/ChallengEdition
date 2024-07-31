package Ders07_NestedIfElseStatements;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        -kullanicidan aldigi urun adedi ve liste fiyatini alin,
        kullaniciya musteri karti olup olmadigini sorun,
        musteri kartı varsa 10 urunden fazla alırsa %20, yoksa %15 indirim yapin,
        musteri kartı yoksa 10 urunden fazla alırsa %15,yoksa %10 indirim yapin.
         */


        int urunAdedi = 30;
        boolean kartVarMi = false;
        double listeFiyati = 12.5;
        double toplamFiyat = 0;

        if (kartVarMi && urunAdedi >=10) {
            toplamFiyat = urunAdedi * listeFiyati * (0.8);
            System.out.println("%20 inidirimli toplam fiyat : " + toplamFiyat);
        } else if (kartVarMi && urunAdedi < 10 && urunAdedi > 0) {
            toplamFiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
        } else if (!kartVarMi && urunAdedi >= 10) {
            toplamFiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
        } else if (!kartVarMi && urunAdedi < 10) {
            toplamFiyat = urunAdedi * listeFiyati * (0.90);
            System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);
        } else {
            System.out.println("gecersiz giris");
        }
    }
}

