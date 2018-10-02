import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Logs {

    public static void main(String[] args) {
// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

        arrayWithUniqueIPs("Log.txt");
    }

    public static int[] arrayWithUniqueIPs(String filename) {

        String[] myUniqueArray = new String[];
        String[] myArray = new String[];

        try {
            Path myPath = Paths.get(filename);
            List<String> lines = Files.readAllLines(myPath);

            for (int i = 0; i < lines.size(); i++) {
                if (myArray.contains())
                myArray[i] = lines.get(i);

            }


            for (int i = 0; i < lines.size() ; i++) {
                lines.get(i);

                if (myList.get().co)

            }



            return myUniqueArray[];


        } catch (IOException e) {
            System.out.println("IOException");
        }

    }

}
