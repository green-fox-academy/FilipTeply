// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class Exercise31DrawSquare {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me dimension of a square.");
        int dim = scanner.nextInt();

        for (int i = 0; i < dim; i++) {
            System.out.print("%");
        }

        System.out.println(" ");

        for (int i = 0; i < dim-2; i++) {
            System.out.print("%");
            for (int n = 0; n < dim-2; n++) {
                System.out.print(" ");

            }
            System.out.println("%");
        }

        for (int i = 0; i < dim; i++) {
            System.out.print("%");
        }
    }
}
