// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class Exercise34ParametricAverage {

    public static void main(String[] args) {

        float sum = 0;
        float average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");

        int howManyInt = scanner.nextInt();


        for (int i = 0; i < howManyInt; i++) {

            System.out.println("Give me your integer # " + (i+1) + ".");

            int number= scanner.nextInt();
            sum = sum + number;

        }

        average = (sum/howManyInt);

        System.out.println("Sum of your " + howManyInt + " numbers is: " + sum );
        System.out.println("Average of your " + howManyInt + " numbers is: " + average);



    }


}
