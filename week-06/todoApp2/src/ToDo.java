/*created by Filip @GFA course week4/day4&5 (11.&12.10.2018)*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ToDo {

    //String filename;


    public ToDo() {
    }

//    public ToDo(String filename) {
//        this();
//        this.filename = filename;
//    }


//functionalities expected from class ToDo  are:
    // -l   Lists all the tasks
    // -a   Adds a new task
    // -r   Removes an task
    // -c   Completes an task


    // -a   Adds a new task
    // addNewTask(arg1, activeFilename)
    // in Main arg1 = args[1]

    // checks
    public void checkItem(String arg1, String filename) {

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

    public void removeTask(String arg1, String filename) {

        int taskNumber;
        //stackOverflow search how to cast String args[]
        //replace the first argument here with: String arg1
        //taskNumber = (int)(arg1);
        List<String> lines1 = new ArrayList<>();
        //List<String> newlines = new ArrayList<>();
        Path myPath1 = Paths.get(filename);

        try {
            lines1 = Files.readAllLines(myPath1);
            lines1.remove(Integer.parseInt(arg1) - 1);

            Files.write(myPath1, lines1);

            //System.out.println(lines1);

        } catch (
                IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }

    }


    public List<String> addNewTask(String arg1, String filename) {

        List<String> lines1 = new ArrayList<>();
        //List<String> newlines = new ArrayList<>();
        Path myPath1 = Paths.get(filename);

        try {
            lines1 = Files.readAllLines(myPath1);
            lines1.add("[ ] " + arg1);
            //System.out.println(lines1);
            Files.write(myPath1, lines1);

        } catch (
                IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }

        return lines1;
    }

    //lists all tasks and adds numbers to each task

    public void listAllTasks(String filename) {

        List<String> lines1 = new ArrayList<>();
        Path myPath1 = Paths.get(filename);

        try {
            lines1 = Files.readAllLines(myPath1);

        } catch (
                IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }

        int i = 1;
        for (String itemline : lines1) {


            System.out.println(i + " - " + itemline);
            i++;

        }
    }

    // opens a file given file and prints the lines1
    // given a path; note: absolute path should be filled as an argument to run
    // the app both in IntelliJ as well as cmd line

    public void opensFileAndPrint(String filename) {

        List<String> lines1 = new ArrayList<>();
        Path myPath1 = Paths.get(filename);

        try {
            lines1 = Files.readAllLines(myPath1);

        } catch (
                IOException e) {
            System.out.println("IOException");
        }

        for (String itemline : lines1) {
            System.out.println(itemline);
        }
    }

    //opens file and returns it as lines1 which is a List<String>

    public List<String> openFile(String filename) {

        List<String> lines1 = new ArrayList<>();
        Path myPath1 = Paths.get(filename);

        try {
            lines1 = Files.readAllLines(myPath1);

        } catch (
                IOException e) {
            System.out.println("IOException");
        }

       // System.out.println(lines1);
        return lines1;
    }
}

//        for (int i = 1; i < args.length; i++) {
//            lines1.add(args[i]);
//        }
//        for (String itemline : lines1) {
//            System.out.println(i + " - " + itemline);
//            i++;
//        }