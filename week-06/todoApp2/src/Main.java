/*created by Filip @GFA course week4/day4&5 (11.&12.10.2018)*/

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        ToDo todo1 = new ToDo();

        String filename1 = "C:/Users/TeplyF/greenfox/TODOAppWeek4_day4and5/todo-app/src/todoList.txt";
        String filename2 = "C:/Users/TeplyF/greenfox/TODOAppWeek4_day4and5/todo-app/src/emptyTodoList.txt";

        String activeFilename = filename2;

        //testing function openFile()
        //todo1.openFile("src/todoList.txt");

        //testing function opensFileAndPrint("src/todoList.txt")
        //todo1.opensFileAndPrint("src/todoList.txt");

        //testing function
        //todo1.openFileAndPrintWithLineNumbers("src/todoList.txt");

        //functionalities expected from class ToDo  are:
        // -l   Lists all the tasks
        // -a   Adds a new task
        // -r   Removes an task
        // -c   Completes an task


        //prints array of String of arguments
        //System.out.println(Arrays.toString(args));



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
            // -l   Lists all the tasks in todo list in a file
            // if there are no tasks it prints  "No todos for today! :)"
        } else if (args[0].equals("-l")) {

            if (todo1.openFile(activeFilename).size() == 0) {
                System.out.println("No todos for today! :)");

            } else {
                todo1.listAllTasks(activeFilename);
            }
        }
        //checks if new task after argument -a has been filled
        // if yes it adds this tasks after -a argument
        else if (args[0].equals("-a")) {

            if (args.length == 1) {
                System.out.println("Unable to add: no task provided.");
            } else {
                todo1.addNewTask(args[1], activeFilename);
            }

            //removes tasks

        } else if (args[0].equals("-r")) {

//$ java Main -r a1
//Exception in thread "main" java.lang.NumberFormatException: For input string: "a1"
//        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//        at java.lang.Integer.parseInt(Integer.java:580)
//        at java.lang.Integer.parseInt(Integer.java:615)
//        at ToDo.removeTask(ToDo.java:47)
//        at Main.main(Main.java:79)

            //to be done: handle situation if arg is: -r apple
            //if(!(args[1].contains("[a-zA-Z]+")) )  {
            try {
                if (args.length == 1) {
                    System.out.println("Unable to remove: no index provided");
                } else {
                    todo1.removeTask(args[1], filename1);
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
                todo1.checkItem(args[1], activeFilename);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
