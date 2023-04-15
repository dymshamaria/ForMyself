package lesson_9.work_with_date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Example {
    public static void main(String[] args) {

//        LocalDate localDate = LocalDate.of(2022,5,21);
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate.getDayOfWeek());
//        System.out.println(localDate.lengthOfMonth());
//        System.out.println(localDate.lengthOfYear());
//        System.out.println(localDate.isLeapYear());
//        System.out.println("__________________");
//        System.out.println(localDate.get(ChronoField.YEAR));
//        System.out.println(localDate.get(ChronoField.MONTH_OF_YEAR));
//        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
//        System.out.println("__________________");
//        System.out.println(LocalDate.now());

//        LocalTime localTime = LocalTime.of(14,43,51);
//        System.out.println(localTime.getHour());
//        System.out.println(localTime.getMinute());
//        System.out.println(localTime.getSecond());

//        LocalTime localTime = LocalTime.parse("13:45:12");
//        System.out.println(localTime.getHour());
//        System.out.println(localTime.getMinute());

//        LocalDate localDate = LocalDate.parse(("2022-15-12"));

//        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.FEBRUARY,21,9,10,32);
//        LocalDate localDate = LocalDate.of(2023,3,17);
//        LocalTime localTime = LocalTime.of(12,47,13);
//        LocalDateTime localDateTime1 = LocalDate.of(localDate,localTime);
//        LocalDateTime localDateTime2 = localDate.atTime(localTime);
//        LocalDateTime localDateTime3 = localTime.atDate(localDate);
//        localDateTime.toLocalTime();

//        Instant instant = Instant.ofEpochSecond(3);
//        Instant instant1 = Instant.ofEpochSecond(3,0);

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now();

        Duration duration = Duration.between(localTime,localTime1);
        Duration duration1 = Duration.between(localDateTime,localDateTime1);

        Period period = Period.between(LocalDate.of(2022,12,12), LocalDate.of(2023,1,1));

        localDateTime.plusDays(1);
        localDateTime.minusDays(1);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        LocalDate date = LocalDate.of(2022,12,12);
        String formattedString = date.format(formatter);
        System.out.println(formattedString);





    }
}
