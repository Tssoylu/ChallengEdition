package Ders07_NestedIfElseStatements;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {

         /*
        -kullanicidan aldigi urun adedi ve liste fiyatini alin,
        kullaniciya musteri karti olup olmadigini sorun,
        musteri kartı varsa 10 urunden fazla alırsa %20, yoksa %15 indirim yapin,
        musteri kartı yoksa 10 urunden fazla alırsa %15,yoksa %10 indirim yapin.
         */

        int urunAdedi = 25;
        boolean kartVarMi = false;
        double listeFiyati = 20;
        double toplamFiyat = 0;

        // ana degisken kart olsun.

        if (kartVarMi) {
            // kart var
            if (urunAdedi<0) {
                System.out.println("Yalnıs urun adedi girisi");
            } else if (urunAdedi<10) {
                toplamFiyat = urunAdedi * listeFiyati * 0.85;
                System.out.println("%15 inidirmli fiyat : " + toplamFiyat);
            }else{
                toplamFiyat = urunAdedi * listeFiyati * (0.80);
                System.out.println("%20 inidirimli toplam fiyat : " + toplamFiyat);
        }

        }else {
            // kart yok
            if (urunAdedi<0) {
                System.out.println("Yalnıs urun adedi girisi");
            } else if (urunAdedi<10) {
                toplamFiyat = urunAdedi * listeFiyati * 0.90;
                System.out.println("%15 inidirmli fiyat : " + toplamFiyat);
            } else {
                toplamFiyat = urunAdedi * listeFiyati * 0.85;
                System.out.println("%15 inidirmli fiyat : " + toplamFiyat);
            }

        }
        }
}
