package Ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();

        System.out.println(tarih); // 2024-09-02

        System.out.println(tarih.minusDays(100)); // 2024-05-25
        System.out.println(tarih.minusWeeks(5).minusDays(3)); // 2024-07-26
        System.out.println(tarih.plusMonths(5).plusWeeks(2).plusDays(3)); // 2025-02-19

        System.out.println(tarih.getMonthValue()); // 9
        System.out.println(tarih.getMonth());  // SEPTEMBER
        System.out.println(tarih.getDayOfWeek()); // MONDAY
        System.out.println(tarih.getDayOfYear()); // 246

        System.out.println(tarih.isLeapYear()); // ture
        System.out.println(tarih.withYear(2000).isLeapYear()); // true
        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13)); // 2020-11-13

        System.out.println(tarih.lengthOfYear()); // 366
        System.out.println(tarih.withYear(2020).lengthOfYear()); // 366

        System.out.println(tarih.withYear(2002).withMonth(4).withDayOfMonth(29).getDayOfWeek()); // MONDAY

        LocalDate date1 = LocalDate.of(2011,11,11);
        LocalDate date2= LocalDate.of(2010,10,10);

        System.out.println(date2.isBefore(date1)); // true
        System.out.println(date2.isAfter(date1)); // false

        System.out.println(tarih.equals(date1)); // false



    }
}
