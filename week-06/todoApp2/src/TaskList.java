import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Task> taskList;
    //int lineNumber;

    String taskListFileName;

    public TaskList(String taskListFileName) {
        this.taskListFileName = taskListFileName;
        this.taskList = new ArrayList<>();
    }


    public void addNewTask(String arg1) {
        List<String> lines1 = new ArrayList<>();
        lines1 = readTaskListFile(taskListFileName);
        lines1.add("[ ] " + arg1);
        saveTaskListIntoFile(lines1);
    }

    public void removeTask(String arg1, String taskListFileName) {

        openFile(this.taskListFileName).add("[ ] " + arg1);
        saveTaskListIntoFile(taskListName, openFile(this.taskListFileName));
        int taskNumber;
        //stackOverflow search how to cast String args[]
        //replace the first argument here with: String arg1
        //taskNumber = (int)(arg1);
        List<String> lines1 = new ArrayList<>();
        //List<String> newlines = new ArrayList<>();
        Path myPath1 = Paths.get(taskListFileName);

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


    public List<String> readTaskListFile(String taskListFileName) {

        List<String> lines1 = new ArrayList<>();
        Path myPath1 = Paths.get(taskListFileName);

        try {
            lines1 = Files.readAllLines(myPath1);

        } catch (
                IOException e) {
            System.out.println("IOException");
        }

        // System.out.println(lines1);
        return lines1;
    }


//    public void opensFileAndPrint(String filename) {
//
//        List<String> lines1 = new ArrayList<>();
//        Path myPath1 = Paths.get(filename);
//
//        try {
//            lines1 = Files.readAllLines(myPath1);
//
//        } catch (
//                IOException e) {
//            System.out.println("IOException");
//        }
//
//        for (String itemline : lines1) {
//            System.out.println(itemline);
//        }
//    }


    public void saveTaskListIntoFile(List lines) {

        try {
            Path myPath = Paths.get(taskListFileName);
            Files.write(myPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
