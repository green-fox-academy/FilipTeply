package w3d2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        String filename = "C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-06-Break\\src\\w3d2\\reversed-order.txt";
        String targetFileNameWithPath = "C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-06-Break\\src\\w3d2\\reversed-reversed-order1.txt";
        createFile(targetFileNameWithPath);
        saveIntoFile(targetFileNameWithPath, reverseOrderOfLines(openTxtFileAndGetLinesAsArrayList(filename)));
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

    public static ArrayList reverseOrderOfLines(ArrayList<String> lines) {
        ArrayList<String> linesInReversedOrder = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            linesInReversedOrder.add(lines.get(lines.size() - 1 - i));
        }
        return linesInReversedOrder;
    }

    public static void createFile(String targetFilenameWithPath) {
        try {
            File file = new File(targetFilenameWithPath);
            if (file.createNewFile())
                System.out.println("File creation successfull");

            else
                System.out.println("Error while creating File, file already exists in specified path");
        } catch (IOException io) {
            io.printStackTrace();
        }

    }

    public static void saveIntoFile(String targetFileNameWithPath, ArrayList lines) {

        try {
            Path myPath = Paths.get(targetFileNameWithPath);
            Files.write(myPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}