import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {

        // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
        Path myPath = Paths.get("filename.txt");


        try {
            Files.write(myPath, ("Boolean char int \n byte stream double long short").getBytes());
            List<String> myList = Files.readAllLines(myPath);

            int lineCount = 0;
            for (int i = 0; i < myList.size(); i++) {
                System.out.println(myList.get(i));
                lineCount++;
            }
            System.out.println(lineCount);
        } catch (IOException except) {
            System.out.println(0);
        }

    }

}
