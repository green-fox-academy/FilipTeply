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
        System.out.println(GetToPostRatio("Log.txt"));
    }

    public static List<String> arrayWithUniqueIPs(String filename) {
        List<String> uniqueIPs = new ArrayList<>();
        try {
            Path myPath = Paths.get(filename);
            List<String> lines = Files.readAllLines(myPath);
            List<String> IPs = new ArrayList<>();


            for (int i = 0; i < lines.size(); i++) {
                IPs.add(lines.get(i).substring(24, 40).trim());
            }

            for (int i = 0; i < IPs.size(); i++) {
                if (!uniqueIPs.contains(IPs.get(i))) {
                    uniqueIPs.add(IPs.get(i));
                }
            }

        } catch (
                IOException e) {
            System.out.println("IOException");
        }
        return uniqueIPs;
    }

    public static double GetToPostRatio(String filename) {

        int GETcount = 0;
        int POSTcount = 0;

        try {

            Path myPath = Paths.get(filename);
            List<String> lines = Files.readAllLines(myPath);
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).contains("GET")) {
                    GETcount++;
                }
                if (lines.get(i).contains("POST")) {
                    POSTcount++;
                }
            }

        } catch (IOException e) {
            System.out.println("IOException");
        }
        return GETcount/POSTcount;


    }


}