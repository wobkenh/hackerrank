package de.henningwobken.hackerrank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfProgrammer {

    final static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

        LocalDate date = LocalDate.of(year, 1, 1);
        if (year < 1918 && year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            date = date.minusDays(1);
        } else if (year == 1918) {
            date = date.plusDays(13);
        }
        return date.plusDays(255).format(format);
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2017));
        System.out.println(dayOfProgrammer(2016));
        System.out.println(dayOfProgrammer(1800));
    }

}
