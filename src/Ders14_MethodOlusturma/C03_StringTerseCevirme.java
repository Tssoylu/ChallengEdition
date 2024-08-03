package Ders14_MethodOlusturma;

public class C03_StringTerseCevirme {

    /*
    - parametre olarak bir Strig kabul edip
      String'in terse cevrilmis halini donduren
      bir method olusturun
     */

    public static void main(String[] args) {

        String input = "Java kod yazdikca ogrenilir";
        System.out.println(StringiTerseCevir(input));


    }

    public static String StringiTerseCevir(String input) {

        String tersStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {

            tersStr = tersStr + input.charAt(i);

        }
        return tersStr;
    }
}