package Ders27_ImmutableClasses_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();

        System.out.println(saat); // 21:14:25.014942100
        System.out.println(saat); // 21:14:48.250780600

        LocalTime saat2=LocalTime.of(16,10,20);

        System.out.println(saat.compareTo(saat2)); // 1

        System.out.println(saat.withNano(45436)); // 21:17:25.000045436
    }
}
