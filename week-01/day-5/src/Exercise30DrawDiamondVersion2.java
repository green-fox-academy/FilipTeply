// blueprint:
// for diamond with height (eg. 5)
// line number (lineNo) for the 1st line is calculated: height/2 (ie 5/2 = 2)
// lineNo count down (lineNo--) goes from height/2 to -height/2 (i.e. 2, 1, 0, -1, -2)
// number of spaces printed on each line before the asterisks = absolute value of lineNo (Math.abs(), ie 2, 1, 0, 1, 2)
// number of asterisks on each line: (height - (Math.abs(lineNo))*2)

import java.util.Scanner;
import java.lang.*;

import static java.lang.Math.abs;

public class Exercise30DrawDiamondVersion2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me height of your diamond.");
        int height = scanner.nextInt();

        int lineNo = height / 2;


        for (int n = 0; n < height; n++) {

            for (int i = 0; i < Math.abs(lineNo); i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < (height - (Math.abs(lineNo)) * 2); i++) {
                System.out.print("*");
            }

            System.out.println(" ");
            lineNo--;
        }


    }


}
