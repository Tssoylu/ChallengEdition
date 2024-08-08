package Ders17_Scope;

public class C01_LocalVariables {
    public static void main(String[] args) {

        // bir method'un icerisinde olusturulan variable'larin Scope'u
        // icinde olusturulduklari method'dur,
        // o method'un disindan ulasilamazlar.

        int sayi=10;
        String isim="Ramazan";
        // System.out.println(dogruMU);

        for (int i = 0; i <10 ; i++) {
            String adres= "Ankara";

            // bir loop icerisinde olusturulan variable'ler sadece o loop icerisinde gecerlidir.
        }

        // System.out.println(adres); (hata verir)

        double pi;

        // System.out.println(pi);
        // local variable'lar deger atamadan olusturulabilir ancak kullanilamaz.
        // kullanmadan once deger atanmis olmalidir.
    }

    public static void method(){

        // System.out.println(sayi); (hata verir)

        // isim="tugay"; (hata verir)

        boolean dogruMu= true; // baska bir method icinde kullanilmaz
    }
}
