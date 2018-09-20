// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

import java.util.Scanner;

public class Exercises19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number.");
        double testNumber = scanner.nextDouble();

        if (testNumber<0)
        {
            System.out.println(testNumber + " is Not enough.");
    }


        else if (testNumber ==2) {
            System.out.println(testNumber + " is Two.");
        }
        else if (testNumber > 2) {
            System.out.println(testNumber + " is A lot.");
        }

}
    }
