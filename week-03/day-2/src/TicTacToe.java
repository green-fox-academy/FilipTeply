//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TicTacToe {
//
//    public static void main(String[] args) {
//        // Write a function that takes a filename as string,
//        // open and read it. The file data represents a tic-tac-toe
//        // game result. Return 'X'/'O'/'draw' based on which player
//        // has winning situation.
//
//        System.out.println(ticTacResult("win-o.txt"))
//        // should print O
//
//        System.out.println(ticTacResult("win-x.txt"))
//        // should print X
//
//        System.out.println(ticTacResult("draw.txt"))
//        // should print draw
//    }
//
//    public static void ticTacResult(String filename) {
//
//        try {
//
//            Path myPath = Paths.get(filename);
//
//            List<String> lines = Files.readAllLines(myPath);
//
//
//
//            for (int i = 0; i < lines.size(i); i++) {
//
//                if ()
//
//                    columns.get(i);
//
//            }
//
//
//            for (int i = 0; i < lines.size(); i++) {
//                if (lines.get(i) == "X" && lines.get(i) == lines.get(i - 1) && lines.get(i) == lines.get(i + 1)) {
//                    System.out.println("X");
//                    if (lines)
//                }
//            }
//
//            System.out.println("O");
//            System.out.println("X");
//            System.out.println("draw");
//
//        } catch (IOException e) {
//            System.out.println("IOException");
//        }
//
//    }
//
//
//}