public class Exercise13 {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int totalSeconds = 60*60*24;


        int remainingSeconds;
remainingSeconds = totalSeconds - currentHours*3600 - currentMinutes*60 - currentSeconds;

        System.out.println(remainingSeconds);
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

    }
}
