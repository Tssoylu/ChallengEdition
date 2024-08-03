package Ders14_MethodOlusturma;

public class C07_AsalsayiKontrol {

    /*
    - kullanicidan main method icinde bir pozitif tamsayi alin
      girilen sayiynin asal sayi olup olmadigini kontrol edin
      sonuc olarak "asal sayi" veya "asal sayi degil" sonuclarindan birini donduren bir method olsuturun
     */

    public static void main(String[] args) {

        int sayi = 23;
        System.out.println(asalSayiKontrolEt(sayi)); // asal sayi
        System.out.println(asalSayiKontrolEt(24)); // asal degil
        System.out.println(asalSayiKontrolEt(23141413)); // asal degil

    }

    public static String asalSayiKontrolEt(int sayi) {

        String sonuc="";

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sonuc="asal degil";
                break;
            }


        }
        if (!sonuc.equals("asal degil")) {
                sonuc="asal sayi";
        }
        return sonuc;
    }
}
