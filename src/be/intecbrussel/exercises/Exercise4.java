package be.intecbrussel.exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise4 {
    public static void main(String[] args) {
        LocalDate myDateOfBirth = LocalDate.of(1991,5,14);

        int dayOfYear = myDateOfBirth.getDayOfYear();
        int dayOfMonth = myDateOfBirth.getDayOfMonth();
        DayOfWeek dayOfWeek = myDateOfBirth.getDayOfWeek();

        System.out.println("My birthday was the "+ dayOfYear + "th day of the year");
        System.out.println("My birthday was " + dayOfMonth + "th day of the months");
        System.out.println("I was born on " + dayOfWeek);

        if (myDateOfBirth.isLeapYear()) {
            System.out.println("Birthday was a leap year.");
        } else {
            System.out.println("Birthday was not a leap year.");
        }
    }
}
