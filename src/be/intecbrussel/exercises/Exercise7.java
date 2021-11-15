package be.intecbrussel.exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a date (format: DD/MM/YYYY");
        String userDateInput = keyboard.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate userDate = LocalDate.parse(userDateInput, formatter);
        System.out.println(userDate);

    }
}
