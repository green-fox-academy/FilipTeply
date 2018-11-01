/*created by Filip @GFA course week4/day4&5 (11.&12.10.2018)*/

public class Task {

    String taskName;
    int id;
    static int counter = 0;
    boolean checked;

    public Task(String taskName) {
        this.taskName = taskName;
        this.checked = false;
        counter++;
        this.id = counter;
    }
}