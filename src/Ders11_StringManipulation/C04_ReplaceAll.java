package Ders11_StringManipulation;

public class C04_ReplaceAll {
    public static void main(String[] args) {

        /*
        - Kullanicinin girdigi metinde
        harf disinda kalan tum karakterleri temizleyen bir kod yazin
         Not: Space silinmemeli
         */

        String input= "9&H2av(a*   co_k 1*guzel";

        input= input.replaceAll("\\d",""); // Ja+va cok *guzel
        input= input.replace(" ","5"); // Ja+va5cok5*guzel
        input= input.replaceAll("\\W",""); // Java5cok5guzel
        input= input.replace("_","");
        input= input.replace("5"," "); // Java cok guzel
        input= input.replaceAll("\\s+"," "); // birden fazla boslugu silmek icin

        System.out.println(input);

    }
}
