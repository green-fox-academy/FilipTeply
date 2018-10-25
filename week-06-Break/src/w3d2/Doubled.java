package w3d2;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import static java.nio.file.Files.write;

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

        ArrayList<String> linesWithDuplicitiesRemoved = new ArrayList<>();

        Path myNewPath = Paths.get("C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-06-Break\\src\\w3d2\\duplicitiesRemoved.txt");

        for (int i = 0; i < lines.size(); i++) {

            for (int j = 1; j < lines.get(i).length(); j++) {

                if (lines.get(i).valueOf(j) == lines.get(i).valueOf(j - 1)) {

                    linesWithDuplicitiesRemoved.get(i).concat(lines.get(i).replace(lines.get(i).valueOf(j-1), ""));

                } else {
                    linesWithDuplicitiesRemoved.get(i).concat(lines.get(i).valueOf(j));
                }
                j--;
            }

        }
        try {
            Files.write(myNewPath, linesWithDuplicitiesRemoved);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}