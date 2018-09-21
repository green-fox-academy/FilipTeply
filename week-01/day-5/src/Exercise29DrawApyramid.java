// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class Exercise29DrawApyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a height of a pyramid.");
        int l = scanner.nextInt();

        for (int lineNo = 1;  lineNo <= l; lineNo++) {

            for (int s = 1; s <= l-lineNo; s++) {
                System.out.print(" ");
            }
            for (int a = 0; a < ((lineNo*2)-1); a++ ) {
                System.out.print("*");

            }
            System.out.println(" ");

        }

    }
}
//
//for (int i = 0; i < l-1; i++) {
//        System.out.print(" ");
//
//
//        }
//        System.out.println();
//        for (int i = 0; i <) {
//        System.out.print("*");
//        }



//
//do {
//        n = i;
//        n++;
//        System.out.print("");
//
//        }
//        while ();