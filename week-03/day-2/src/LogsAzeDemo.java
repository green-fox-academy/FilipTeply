import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogsAzeDemo {
    public static void main(String[] args) {
        System.out.println(getUniqueIps("Log.txt").size());
        System.out.println(getIpsOnlyOnce("Log.txt").size());
        System.out.println(getPostRatio("Log.txt"));
    }

    public static List<String> getIpsOnlyOnce(String filename) {
        List<String> uniqueIps = new ArrayList<>();
        Map<String, Integer> ipCount = new HashMap<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for(String line : lines) {
                String currentIP = line.split("   ")[1];
                if (!ipCount.containsKey(currentIP)) {
                    ipCount.put(currentIP, 1);
                } else {
                    ipCount.put(currentIP, ipCount.get(currentIP)+1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String ip : ipCount.keySet()) {
            if (ipCount.get(ip) == 1) {
                uniqueIps.add(ip);
            }
        }
        return uniqueIps;
    }

    public static List<String> getUniqueIps(String filename) {
        List<String> uniqueIps = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for(String line : lines) {
                String currentIP = line.split("   ")[1];
                if (!uniqueIps.contains(currentIP)) {
                    uniqueIps.add(currentIP);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uniqueIps;
    }

    public static double getPostRatio(String filename) {
        int get = 0, post = 0;
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for(String line : lines) {
                if (line.contains("POST")) {
                    post++;
                }
                if (line.contains("GET")) {
                    get++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (double) get / (double) post;
    }
}