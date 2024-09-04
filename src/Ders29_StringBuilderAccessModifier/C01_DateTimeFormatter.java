package Ders29_StringBuilderAccessModifier;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime zaman= LocalDateTime.now();
        System.out.println(zaman); // 2024-09-04T12:42:50.665248

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println(zaman.format(dtf1)); // 04/09/2024

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d:MMM:YY");
        System.out.println(zaman.format(dtf2)); // 4:Eyl:24

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("d:MMMM:YYYY EEEE");
        System.out.println(zaman.format(dtf3)); // 4:Eylül:2024 Çarşamba

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(zaman.format(dtf4)); // 12:55 ÖS

    }
}
