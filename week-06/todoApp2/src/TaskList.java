import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Task> taskList;
    String taskListFileName;

    public TaskList(String taskListFileName) {
        this.taskListFileName = taskListFileName;
        this.taskList = new ArrayList<>();
        createFile(taskListFileName);
    }

    public void addNewTask(String arg1) {

        List<String> lines1;
        lines1 = readTaskListFile();
        lines1.add("[ ] " + arg1);
        saveTaskListIntoFile(lines1);
    }

    public void removeTask(String arg1) {
        List<String> lines1;
        lines1 = readTaskListFile();
        lines1.remove(Integer.parseInt(arg1) - 1);
        saveTaskListIntoFile(lines1);
    }

    public void listAllTasks() {
        List<String> lines1;
        lines1 = readTaskListFile();
        int i = 1;
        for (String itemline : lines1) {
            System.out.println(i + " - " + itemline);
            i++;
        }
    }

    public List<String> readTaskListFile() {
        List<String> lines1 = new ArrayList<>();
        Path myPath1 = Paths.get(taskListFileName);
        try {
            lines1 = Files.readAllLines(myPath1);
        } catch (
                IOException e) {
            System.out.println("IOException");
        }
        return lines1;
    }

    public void saveTaskListIntoFile(List lines) {
        try {
            Path myPath = Paths.get(taskListFileName);
            Files.write(myPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFile(String filename3) {
        try {
            File file = new File(filename3);
            if (file.createNewFile()) {
                System.out.println("File creation successfull");
            } else {
                System.out.println("Error while creating File, file already exists in specified path");
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

}
