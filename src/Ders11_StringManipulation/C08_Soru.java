package Ders11_StringManipulation;

public class C08_Soru {
    public static void main(String[] args) {

        /*
        - Soru: kullanicidan bir sifre isteyip assagidaki sartlari kontrol edin ve
        kullaniciya duzeltmesi gereken tum eksikleri soyleyin
        eger tum sartlari saglarsa "sifre basariyla kaydedildi"
        -ilk harf buyuk harf olamali
        -son karakter rakam olmali
        -sifre bosluk icermemeli
        -uzunlugu en az 10 karakter olamli
         */

        String sifre= "nasilsinKardes0";
        int bayrak=0;

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0) <='z')){
            System.out.println("Ilk harf kucuk harf olmali");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
            System.out.println("Son karakter rakam olmali");
            bayrak++;
        }
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            bayrak++;
        }
        if (!(sifre.length()>=10)) {
            System.out.println("Sifre en az 10 haneli olmali");
            bayrak++;
        }if (bayrak==0) {
            System.out.println("Sifreniz basari ile kaydedildi");
        }
    }
}
