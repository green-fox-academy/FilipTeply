import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        System.out.println("Insert distance in km.");
        Scanner scanner = new Scanner(System.in);

        int distanceInKm = scanner.nextInt();

        double distanceInMiles = (distanceInKm/1.60);
        System.out.println(distanceInKm + " kilometers is " + distanceInMiles + " miles.");



        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}
