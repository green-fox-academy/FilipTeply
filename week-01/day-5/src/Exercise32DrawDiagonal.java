
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class Exercise32DrawDiagonal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me dimension of a square.");
        int dim = scanner.nextInt();
        int lineNo = 2;

//1st loop: prints top line: %%%..
        for (int i = 0; i < dim; i++) {
            System.out.print("%");
        }
//1st loop fin
        System.out.println(" ");
//2nd line starts here


//2nd loop prints: %...%...%
// initial % for (int n = lineNo; n < dim; n++)
        for (int n = lineNo; n < (dim); n++) {
            System.out.print("%");

            //2.1 loop prints: x spaces, x = lineNo-2
            for (int m = 0; m < lineNo - 2; m++) {
                System.out.print(" ");
            }
            //2.1 loop fin

            //diagonal element printed
                System.out.print("%");

            //2.2 loop prints:  (dim-lineNo-1) spaces
            for (int p = 0; p < dim - lineNo-1; p++) {
                System.out.print(" ");
            }
            //2.2th loop

            //prints final % and linebreak on an internal line

                System.out.println("%");
                lineNo++;

        }
//2nd loop finished







//and final line prints in case dimension is > 1 : %%%...
        if (dim > 1)  {
            for (int i = 0; i < dim; i++) {
                System.out.print("%");
            }
        }
//followed by linebreak
        System.out.println(" ");



    }
}