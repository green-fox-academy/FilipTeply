package w3d2;

import w2d1.Array;
import w3d3.Animal;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt

        String filename = "C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-06-Break\\src\\w3d2\\encoded-lines.txt";
        String targetFileNameWithPath = "C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-06-Break\\src\\w3d2\\decoded-lines1.txt";
        createFile(targetFileNameWithPath);
        saveIntoFile(targetFileNameWithPath, decodeLines(openTxtFileAndGetLinesAsArrayList(filename)));
    }

    public static ArrayList<String> openTxtFileAndGetLinesAsArrayList(String filename) {
        List<String> lines = new ArrayList<>();
        try {
            Path myPath = Paths.get(filename);
            lines = Files.readAllLines(myPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (ArrayList<String>) lines;
    }

    public static ArrayList<String> decodeLines(ArrayList<String> lines) {
        ArrayList<String> decodedLines = new ArrayList<>();
        String decodingEncodingString = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ[./*+!\"'(-.");

        for (int i = 0; i < lines.size(); i++) {
            StringBuilder sb = new StringBuilder(lines.get(i));
            StringBuilder decodedSb = new StringBuilder();

            for (int j = 0; j < sb.length() + 1; i++) {
                if (sb.charAt(j) != ' ' || sb.charAt(j) != 'a') {
                    decodedSb.append(decodingEncodingString.charAt(decodingEncodingString.indexOf(sb.charAt(j)) - 1));
                } else {
                    decodedSb.append(" ");
                }
            }
            decodedLines.add(i, decodedSb.toString());
        }
        return decodedLines;
    }

    public static void createFile(String targetFilenameWithPath) {
        try {
            File file = new File(targetFilenameWithPath);
            if (file.createNewFile()) {
                System.out.println("File creation successfull");
            } else {
                System.out.println("Error while creating File, file already exists in specified path");
            }
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
