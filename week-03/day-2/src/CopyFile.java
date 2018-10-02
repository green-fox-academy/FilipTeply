import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    // Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
    public static void main(String[] args) {


        copyFile("my-test-file3.txt", "my-test-file3-copy2.txt");
    }

    public static void copyFile(String source, String destination) {

        try {
            Path mySourcePath = Paths.get(source);
//            List<String> content = new ArrayList<>();
//            content = Files.readAllLines(mySourcePath);
            List<String> content = Files.readAllLines(mySourcePath);
            Path myDestinationPath = Paths.get(destination);
            Files.write(myDestinationPath, content);
        } catch (IOException except) {
            System.out.println("IOException");
        }

    }


}
