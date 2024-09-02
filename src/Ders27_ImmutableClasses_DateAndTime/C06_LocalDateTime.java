package Ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime zaman = LocalDateTime.now();

        System.out.println(zaman); // 2024-09-02T21:18:42.301801400

        System.out.println(zaman.getDayOfYear()); // 246

    }
}
