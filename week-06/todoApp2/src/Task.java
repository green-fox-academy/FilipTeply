/*created by Filip @GFA course week4/day4&5 (11.&12.10.2018)*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Task {

    String taskName;
    int id;
    static int counter = 0;
    boolean checked;

    int createdAt;
    int completedAt;

    public Task(String taskName) {
        this.taskName = taskName;
        this.checked = false;
        counter++;
        this.id = counter;
        //this.createdAt = Time.now();

    }

    public void checkTask (String arg1){
        List<String> lines1 = new ArrayList<>();
        Path myPath1 = Paths.get(taskListFileName);
        try {
            lines1 = Files.readAllLines(myPath1);
            lines1.set(Integer.parseInt(arg1) - 1, "[x] " + (lines1.get(Integer.parseInt(arg1) - 1)).substring(4));
            Files.write(myPath1, lines1);
        } catch (
                IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }
    }
}