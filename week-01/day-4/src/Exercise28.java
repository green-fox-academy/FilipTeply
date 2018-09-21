// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class Exercise28 {

    public static void main(String[] args) {

        System.out.println("Please, give me a number which determines size of a triangle.");

        Scanner scanner = new Scanner(System.in);

        int triangleSize = scanner.nextInt();

        for (int i = 1; i <= triangleSize; i++) {
                int n = 1;
            do {
                System.out.print("*");
                n++;
            } while (n <= i);
            System.out.println("");
        }

    }

}


 //for (int i = 1; i <= triangleSize; i++) {
 //        int n = 1;
 //        do {
 //        System.out.print("*");
 //        n++;
 //        } while (n <= i);
 //        System.out.print("\n");
 //        }
//
//for (int i = 1; i <= triangleSize; i++) {
//        int n = 1;
//        do {
//        System.out.print("*");
//        n++;
//        } while (n <= i);
//        System.out.println("\n");
//        }


// System.out.println("\n");

//
// do {
//         System.out.print("value of x : " + x );
//         x++;
//         System.out.println("*"*i);
//         }while( x < 20 );