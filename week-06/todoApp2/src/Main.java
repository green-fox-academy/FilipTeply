/*created by Filip @GFA course week4/day4&5 (11.&12.10.2018)*/


public class Main {


    public static void main(String[] args) {
        String filename1 = "C:/Users/TeplyF/greenfox/TODOAppWeek4_day4and5/todo-app/src/todoList.txt";
        String filename2 = "C:/Users/TeplyF/greenfox/TODOAppWeek4_day4and5/todo-app/src/emptyTodoList.txt";
        String filename3 = "C:/Users/TeplyF/greenfox/TODOAppWeek4_day4and5/todo-app/src/todoList2.txt";

        TaskList homeTaskList1 = new TaskList(filename1);
        TaskList workTaskList1 = new TaskList(filename3);

        ArgumentHandler handler1 = new ArgumentHandler(homeTaskList1);


    }

}
