/*created by Filip @GFA course week4/day4&5 (11.&12.10.2018)*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task {

    //String filename;
    String taskName;
    int id;
    static int counter = 0;
    boolean checked;

    public Task(String taskName) {
        this.taskName=taskName;
        this.checked = false;
        counter++;
        this.id = counter;

    }


//functionalities expected from class Task  are:
    // -l   Lists all the tasks
    // -a   Adds a new task
    // -r   Removes an task
    // -c   Completes an task


    // -a   Adds a new task
    // addNewTask(arg1, activeFilename)
    // in Main arg1 = args[1]
    // checks


    public void checkTask(String arg1, String filename) {

        List<String> lines1 = new ArrayList<>();
        //List<String> newlines = new ArrayList<>();
        Path myPath1 = Paths.get(filename);

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





    //lists all tasks and adds numbers to each task



    // opens a file given file and prints the lines1
    // given a path; note: absolute path should be filled as an argument to run
    // the app both in IntelliJ as well as cmd line


    //opens file and returns it as lines1 which is a List<String>


}

//        for (int i = 1; i < args.length; i++) {
//            lines1.add(args[i]);
//        }
//        for (String itemline : lines1) {
//            System.out.println(i + " - " + itemline);
//            i++;
//        }