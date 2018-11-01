import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArgumentHandler {

    TaskList taskList;

    public ArgumentHandler(TaskList taskList) {
        this.taskList = taskList;
    }

    public void handle(String[] args) {

        if (args.length == 0) {
            //prints command line arguments to terminal
            System.out.println("Command Line Todo application\n" +
                    "=============================\n" +
                    "\n" +
                    "Command line arguments:\n" +
                    " -l   Lists all the tasks\n" +
                    " -a   Adds a new task\n" +
                    " -r   Removes an task\n" +
                    " -c   Completes an task\n"
            );

        } else if (args[0].equals("-l")) {

            if (taskList.readTaskListFile().size() == 0) {
                System.out.println("No todos for today! :)");

            } else {
                taskList.listAllTasks();
            }
        } else if (args[0].equals("-a")) {

            if (args.length == 1) {
                System.out.println("Unable to add: no task provided.");
            } else {
                taskList.addNewTask(args[1]);
            }

        } else if (args[0].equals("-r")) {

//$ java Main -r a1
//Exception in thread "main" java.lang.NumberFormatException: For input string: "a1"
//        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//        at java.lang.Integer.parseInt(Integer.java:580)
//        at java.lang.Integer.parseInt(Integer.java:615)
//        at Task.removeTask(Task.java:47)
//        at Main.main(Main.java:79)

            //to be done: handle situation if arg is: -r apple
            //if(!(args[1].contains("[a-zA-Z]+")) )  {
            try {
                if (args.length == 1) {
                    System.out.println("Unable to remove: no index provided");
                } else {
                    taskList.removeTask(args[1]);
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to remove: index is out of bound");
            }
        }

        // else {
//                //System.out.println("Unable to remove: index is not a number");
//            }

        else if (args[0].equals("-c")) {

            try {
                taskList.checkTask(args[1]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }




    }
}




