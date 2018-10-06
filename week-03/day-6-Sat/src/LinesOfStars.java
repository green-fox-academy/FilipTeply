import java.util.Scanner;

public class LinesOfStars {

    public static void main(String[] args) {


        int height;

        System.out.println("Give me height of your triangle.");
        Scanner scan = new Scanner(System.in);
        height = scan.nextInt();
        System.out.println();
        int lineNo = 0;


        for (int i = 0; i < height; i++) {
            lineNo++;
            for (int j = 0; j < lineNo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
