package Ders10_StringManipulation;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {

        /*
        mail kontrolu yapan bir program hazirlayin
        mail @ isareti icermiyorsa "gecersiz mail"
        mail @gmail.com isareti iceriyorsa "gmail adresi giriniz"
        mail @gmail.com isareti ile bitmiyorsa "yazim hatasi"
        seklinde sonuc yazdiriniz.
         */

        String email= "ahmetbulutluoz@gmail.com";

        if (!email.contains("@")){
            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");
        }else {
            System.out.println("email basari ile kaydedildi");
        }
    }
}
