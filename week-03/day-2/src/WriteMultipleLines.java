import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteMultipleLines {

    public static void main(String[] args) {

        // Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

        Path myPath = Paths.get("my-test-file3.txt");

        String word = "apple";
        int lineNo = 5;

        pathWordsNumber(myPath, word, lineNo);
    }

    public static void pathWordsNumber(Path myPath, String word, int lineNo) {

        try {
            List<String> lines = Files.readAllLines(myPath);

            for (int i = 0; i < lineNo; i++) {
                lines.add(word);
            }
            Files.write(myPath, lines);
            System.out.println(lines);
            System.out.println(lines.size());

        } catch (IOException e) {
            System.out.println("IOException");
        }


    }

}
