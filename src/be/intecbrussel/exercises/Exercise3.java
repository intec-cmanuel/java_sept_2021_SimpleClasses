package be.intecbrussel.exercises;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number from 1-7 to select day of week. (1 is monday, etc...");
        if (!keyboard.hasNextInt()) {
            System.out.println("Input is not a number, program exits");
            return;
        }

        int userDayNumber = keyboard.nextInt();
        if (userDayNumber < 1 || userDayNumber > 7) {
            System.out.println("Number entered not between 1 and 7, program exits");
            return;
        }

        DayOfWeek dayOfWeek;
        System.out.println("enter an integer as number of days to add.");
        if (!keyboard.hasNextInt()){
            System.out.println("Input is not a number, program exits");
            return;
        }

        int userDaysToAdd = keyboard.nextInt();
        if (userDaysToAdd < 0) {
            System.out.println("number entered not an integer, program exits");
            return;
        }

        dayOfWeek = DayOfWeek.of(userDayNumber).plus(userDaysToAdd);
        System.out.println("Initial day + number of days to add results in: " + dayOfWeek);


//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Enter a day of week [1-7]: ");
//        int day = keyboard.nextInt();
//        System.out.println("Enter days to add: ");
//        int add = keyboard.nextInt();
//
//        DayOfWeek day1 = DayOfWeek.of(day);
//        DayOfWeek day2 = day1.plus(add);
//
//        System.out.println(day1);
//        System.out.println(day2);
//
//        keyboard.close();
    }
}
