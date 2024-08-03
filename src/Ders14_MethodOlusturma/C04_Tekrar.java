package Ders14_MethodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // bu iki sayinin carpim sonucunu yeni kod yazamdan konsola yazdirin

        System.out.println(C01_Carpim.carpimMethodu(a, b)); // 200.0

        String c="Nasil";
        String d="Yani";

        System.out.println(C02_StringConcate.birlestirMethodu(c, d)); // Nasil Yani

        String e="Buda mi oldu?";

        // e String'ini tersten yazdirin

        System.out.println(C03_StringTerseCevirme.StringiTerseCevir(e)); // ?udlo im aduB

        // "Bu cumleyi terse cevirin"

        System.out.println(C03_StringTerseCevirme.StringiTerseCevir("Bu cumleyi terse cevirin"));

        String str="Java cok guzel";

        // Str'i buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase());
    }
}
