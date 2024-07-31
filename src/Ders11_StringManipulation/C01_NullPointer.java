package Ders11_StringManipulation;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1="";
        // str1 e deger atanmistir

        System.out.println(str1); // hiclik yazdirir
        System.out.println(str1.concat("Java")); // Java

        String str2;
        // str2 olsuturuldu ama deger atanmadi

        // System.out.println(str2); // str2 ye deger atanmadigi icin yazdirilamaz

        // System.out.println(str2.concat("Java")); // str2 ye deger atanmadigi icin methodla kullanilamaz

        str2="Java candir";
        System.out.println(str2); // Java candir
        System.out.println(str2.concat(".")); // Java candir.

        String str3=null; // str3'e deger atanmamistir
                          // null pointer ile javaya deger atamadigimizin farkinda oldugumuzu belirtiyoruz

        System.out.println(str3); // null isaretlendigini yazdirir

        // System.out.println(str3.concat("Java")); // NullPointerException hatasi verir

        System.out.println(str3 + "Java" ); // nullJava

        // System.out.println(str3.toUpperCase()); // NullPointerException hatasi verir mehtod null ile kullanilmaz




    }
}
