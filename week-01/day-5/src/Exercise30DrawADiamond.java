// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was


import java.util.Scanner;

public class Exercise30DrawADiamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an odd number representing a height of a pyramid.");
        int height = scanner.nextInt();

        int l = height;


        for (int lineNo = 1;  lineNo <= l; lineNo++) {

            for (int s = 1; s <= (l-lineNo); s++) {
                System.out.print(" ");
            }
            for (int a = 0; a < ((lineNo*2)-1); a++ ) {
                System.out.print("*");

            }
            System.out.println(" ");
        }


        for (int lineNo = l;  lineNo >= 0; lineNo--) {

            for (int s = 1; s <= (l-lineNo); s++) {
                System.out.print(" ");
            }
            for (int a = 0; a < ((lineNo*2)-1); a++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }



    }
}

//
//System.out.println("Give me an odd number representing a height of a pyramid.");
//        int l = scanner.nextInt();
//
//        for (int lineNo = 1;  lineNo <= l; lineNo++) {
//
//        for (int s = 1; s <= (l-lineNo); s++) {
//        System.out.print(" ");
//        }
//        for (int a = 0; a < ((lineNo*2)-1); a++ ) {
//        System.out.print("*");
//
//        }
//        System.out.println(" ");
//        }
//
//
//        for (int lineNo = l;  lineNo >= 0; lineNo--) {
//
//        for (int s = 1; s <= (l-lineNo); s++) {
//        System.out.print(" ");
//        }
//        for (int a = 0; a < ((lineNo*2)-1); a++ ) {
//        System.out.print("*");
//
//        }
//        System.out.println("");
//
//        }