package Ders26_PassByValue_ImmutableClasses;

public class C07_ImmutableString {
    public static void main(String[] args) {

        String str="Java candir";

        str=str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        /*
        Immutable class'lardan oluturulan bir obje'nin degeri degistirilemez
        eger atama yaparsak java degerini degistirmez
        bunun yerine yeni bir obje olusturur
        ve bu yeni objeye yeni atadigimiz degeri atar.

        eski obje bosa cikar ve garbage collektor tarafindan silinmeyi bekler.
         */
    }
}
