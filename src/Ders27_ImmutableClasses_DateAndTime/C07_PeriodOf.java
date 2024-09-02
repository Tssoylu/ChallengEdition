package Ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        // dogumunuzdan bugune ne kadar zaman gecti?

        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu= LocalDate.of(2002,04,29);

        Period gecenSure = Period.between(dogumGunu,bugun);

        System.out.println(gecenSure); // P22Y4M4D

        System.out.println(gecenSure.getYears()); // 22s

    }
}
