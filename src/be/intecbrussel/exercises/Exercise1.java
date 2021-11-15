package be.intecbrussel.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        while (true) {
            Scanner keyboard = new Scanner(System.in);
            if (keyboard.hasNextInt(16)) {
                String input = keyboard.next();
                Integer intInput = Integer.parseInt(input, 16);
                System.out.println("The integer value of your input is: " + intInput);
                System.out.println("The bit value of your input is: " + Integer.bitCount(intInput));
                System.out.println("The byte value of your input is: " + intInput.byteValue());
            } else {
                System.out.println("Try again. This time just press int number.");
            }

            System.out.println("Do you wanna go again? ");
            if (keyboard.next().equals("no")) {
                break;
            }
        }
    }
}
