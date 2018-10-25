package w2d2;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    public static void main(String... args) {

        calculate();
    }

    public static void calculate() {
        System.out.println("Please type in the expression:");
        Scanner myScanner = new Scanner(System.in);
        String calcInput = myScanner.nextLine();


        //splits one-line String input to array of Strings
        String[] arrInput = calcInput.split(" ");

        System.out.println(Arrays.toString(arrInput));


        double firstNumber = (double) Integer.parseInt(arrInput[1]);
        double secondNumber = (double) Integer.parseInt(arrInput[2]);

        if (arrInput[0].equals("+")) {
            System.out.println(firstNumber + secondNumber);
        }

        if (arrInput[0].equals("-")) {
            System.out.println(firstNumber - secondNumber);
        }

        if (arrInput[0].equals("*")) {
            System.out.println(firstNumber * secondNumber);
        }

        if (arrInput[0].equals("/")) {
            System.out.println(firstNumber / secondNumber);
        }

        if (arrInput[0].equals("%")) {
            System.out.println(firstNumber % secondNumber);
        }

        //How to exit the program?
        //System.exit(0);

    }
}