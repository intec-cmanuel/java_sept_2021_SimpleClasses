package be.intecbrussel.exercises;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exercise6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate myBirthday = LocalDate.of(1996, 7, 4);
        period(myBirthday, now);
        totalDay(myBirthday, now);
        totalMonth(myBirthday, now);
        totalYear(myBirthday, now);
    }

    private static void period(LocalDate myBirthday, LocalDate now){
        Period period = Period.between(myBirthday, now);
        System.out.println("I am " + period.getYears() + " years and " + period.getMonths() + " months and " + period.getDays() + " days");
    }

    private static void totalDay(LocalDate myBirthday, LocalDate now){
        System.out.println("Until now I lived " + ChronoUnit.DAYS.between(myBirthday, now) * 24 + " hours");
    }

    private static void totalMonth(LocalDate myBirthday, LocalDate now){
        System.out.println("Until now I lived " + ChronoUnit.MONTHS.between(myBirthday, now) + " months");
    }

    private static void totalYear(LocalDate myBirthday, LocalDate now){
        System.out.println("Until now I lived " + ChronoUnit.YEARS.between(myBirthday, now) + " eternities");
    }
}
