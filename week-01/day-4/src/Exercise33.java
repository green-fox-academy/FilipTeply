// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class Exercise33 {

    public static void main(String[] args) {

        int storedNumber = 8;
        System.out.println("Guess what number I store.");
        Scanner scanner = new Scanner(System.in);

        int yourGuessNumber = scanner.nextInt();



            if (yourGuessNumber != storedNumber) {
                if (yourGuessNumber > storedNumber) {
                    System.out.println("The stored number is lower.");

                } else {
                    System.out.println("The stored number is higher.");
                }
                System.out.println("Give me another guess.");


            } else {
                System.out.println("Great! You found the number: " + storedNumber);
            }


        }


}

//  (yourGuessNumber > storedNumber) {
//            System.out.println("The stored number is lower");