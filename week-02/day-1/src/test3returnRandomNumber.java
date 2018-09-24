import java.util.Scanner;

public class test3returnRandomNumber {

    static int randomNumber; //Class variable
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(getRandomNumber());
        int guessResult = 1;
        int randomGuess = 0;

        while (guessResult != -1) {
            System.out.println("Guess a number between O and 50:");
            randomGuess = userInput.nextInt();
            guessResult = checkGuess(randomGuess);
        }
        System.out.println("Yes, the random number is " + randomGuess);
    }

public static int getRandomNumber(){
        randomNumber = (int) (Math.random()*51);
        return randomNumber;
}

public static int checkGuess(int guess)
{
if (guess == randomNumber) {
return -1;
}
else { return 2;
}

}


}
