package w3d2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        String filename = "C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-06-Break\\src\\w3d2\\reversed-lines.txt";

        reverseLinesAndWriteIntoTxtFile(openTxtFileAndGetLinesAsArrayList(filename));

    }

    public static ArrayList openTxtFileAndGetLinesAsArrayList(String filename) {

        List<String> lines = new ArrayList<>();
        try {
            Path myPath = Paths.get(filename);
            lines = Files.readAllLines(myPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (ArrayList) lines;
    }


    public static void reverseLinesAndWriteIntoTxtFile(ArrayList<String> lines) {

        ArrayList<String> linesReversed = new ArrayList<>();

        Path myNewPath = Paths.get("C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-06-Break\\src\\w3d2\\reversed-reversed-lines.txt");

        for (int i = 0; i < lines.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < lines.get(i).length(); j++) {
                sb.append(lines.get(i).charAt(lines.get(i).length() - 1 - j));
            }
            linesReversed.add(i, sb.toString());
        }
        try {
            Files.write(myNewPath, linesReversed);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}