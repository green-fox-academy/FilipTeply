package w3d2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        String filename = "C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-06-Break\\src\\w3d2\\doubled.txt";

        removeMultiplicatedCharactersAndWriteIntoTxtFile(openTxtFileAndGetLinesAsArrayList(filename));

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


    public static void removeMultiplicatedCharactersAndWriteIntoTxtFile(ArrayList<String> lines) {

        ArrayList<String> newLines = new ArrayList<>();
        Path myNewPath = Paths.get("C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-06-Break\\src\\w3d2\\duplicitiesRemoved.txt");

        for (int i = 0; i < lines.size(); i++) {
            StringBuilder sb = new StringBuilder(lines.get(i));
            for (int j = 0; j < sb.length() - 1; j++) {
                if (sb.charAt(j) == sb.charAt(j + 1)) {
                    sb.deleteCharAt(j);
                    j--;
                }
            }
            newLines.add(i, sb.toString());

        }
        try {
            Files.write(myNewPath, newLines);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}