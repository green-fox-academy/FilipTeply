import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    public static void main(String[] args) {
// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

        arrayWithUniqueIPs("Log.txt");
    }

    public static String[] arrayWithUniqueIPs(String filename) {

        try {
            Path myPath = Paths.get(filename);
            List<String> lines = Files.readAllLines(myPath);
            List<String> IPs = ArrayList<>();
            List<String> uniqueIPs = ArrayList<>();

            for (int i = 0; i < lines.size(); i++) {
                IPs.add(lines.get(i).substring(24, 40).trim());
            }

            for (int i = 0; i < IPs.size(); i++) {
                if (!uniqueIPs.contains(IPs.get(i))) {
                    uniqueIPs.add(IPs.get(i));
                }
            }

            String[] myUniqueIParray;
            for (int i = 0; i < uniqueIPs.size(); i++) {
                myUniqueIParray[i] = uniqueIPs.get(i);
            }
            return myUniqueIParray;

        } catch (
                IOException e) {
            System.out.println("IOException");
        }
    }
}