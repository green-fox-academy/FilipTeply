import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        System.out.println(ticTacResult("c:/Users/TeplyF/greenfox/FilipTeply/week-03/day-2/src/win-o.txt"));
        // should print O

        System.out.println(ticTacResult("c:/Users/TeplyF/greenfox/FilipTeply/week-03/day-2/src/win-x2.txt"));
        // should print X


        System.out.println(ticTacResult("c:/Users/TeplyF/greenfox/FilipTeply/week-03/day-2/src/win-x3.txt"));
        // should print X

        System.out.println(ticTacResult("c:/Users/TeplyF/greenfox/FilipTeply/week-03/day-2/src/win-o2.txt"));
        // should print O

        System.out.println(ticTacResult("c:/Users/TeplyF/greenfox/FilipTeply/week-03/day-2/src/draw.txt"));
        // should print draw

        System.out.println(ticTacResult("c:/Users/TeplyF/greenfox/FilipTeply/week-03/day-2/src/win-xBiggerBoard.txt"));
        // should print X

        System.out.println(ticTacResult("c:/Users/TeplyF/greenfox/FilipTeply/week-03/day-2/src/win-oBiggerBoard2.txt"));
        // should print O

        System.out.println(ticTacResult("c:/Users/TeplyF/greenfox/FilipTeply/week-03/day-2/src/win-oBiggerBoard3.txt"));
        // should print O

    }

    public static String ticTacResult(String filename) {

        try {

            Path myPath = Paths.get(filename);

            List<String> lines = Files.readAllLines(myPath);

/// all done for square boards /i.e. number of rows == number of columns/

///checks for consecutive substrings "XXX" in lines
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.size() - 2; j++) {
                    if (lines.get(i).charAt(j) == 'X' && lines.get(i).charAt(j + 1) == 'X' && lines.get(i).charAt(j + 2) == 'X') {
                        return "X";
                    }
                }
            }
///checks for consecutive XXX in columns
            for (int i = 0; i < lines.size() - 2; i++) {
                for (int j = 0; j < lines.size(); j++) {
                    if (lines.get(i).charAt(j) == 'X' && lines.get(i + 1).charAt(j) == 'X' && lines.get(i + 2).charAt(j) == 'X') {
                        return "X";
                    }
                }
            }
///checks for consecutive substrings XXX in diagonal directions (descending)
            for (int i = 0; i < lines.size() - 2; i++) {
                for (int j = 0; j < lines.size() - 2; j++) {
                    if (lines.get(i).charAt(j) == 'X' && lines.get(i + 1).charAt(j + 1) == 'X' && lines.get(i + 2).charAt(j + 2) == 'X') {
                        return "X";
                    }
                }
            }

///checks for consecutive substrings XXX in diagonal directions (ascending)
            for (int i = 0; i < lines.size()-2; i++) {
                for (int j = 0; j < lines.size() -2; j++) {
                    if (lines.get(i+2).charAt(j) == 'X' && lines.get(i + 1).charAt(j + 1) == 'X' && lines.get(i).charAt(j+2) == 'X') {
                        return "X";
                    }
                }
            }


//            for (int i = 0; i < lines.size(); i++) {
//                if (lines.get(i).contains("OOO")) {
//                    return "O";
//                }
//            }

///checks for consecutive substrings "OOO" in lines
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.size() - 2; j++) {
                    if (lines.get(i).charAt(j) == 'O' && lines.get(i).charAt(j + 1) == 'O' && lines.get(i).charAt(j + 2) == 'O') {
                        return "O";
                    }
                }
            }
///checks for consecutive OOO in columns
            for (int i = 0; i < lines.size() - 2; i++) {
                for (int j = 0; j < lines.size(); j++) {
                    if (lines.get(i).charAt(j) == 'O' && lines.get(i + 1).charAt(j) == 'O' && lines.get(i + 2).charAt(j) == 'O') {
                        return "O";
                    }
                }
            }
///checks for consecutive substrings OOO in diagonal directions (descending)
            for (int i = 0; i < lines.size() - 2; i++) {
                for (int j = 0; j < lines.size() - 2; j++) {
                    if (lines.get(i).charAt(j) == 'O' && lines.get(i + 1).charAt(j + 1) == 'O' && lines.get(i + 2).charAt(j + 2) == 'O') {
                        return "O";
                    }
                }
            }

///checks for consecutive substrings OOO in diagonal directions (ascending)
            for (int i = 0; i < lines.size()-2; i++) {
                for (int j = 0; j < lines.size() -2; j++) {
                    if (lines.get(i+2).charAt(j) == 'O' && lines.get(i + 1).charAt(j + 1) == 'O' && lines.get(i).charAt(j+2) == 'O') {
                        return "O";
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("IOException");
        }
        return "draw";
    }


}