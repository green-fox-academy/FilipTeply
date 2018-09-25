

public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        String todoTextEdit1 = todoText.replace(" -", "My todo:\n -");
        String todoTextEdit2 = todoTextEdit1.replace("lk\n", "lk\n - Download games\n    - Diablo\n");


        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        //System.out.println(todoTextEdit1);

        System.out.println(todoTextEdit2);

        //System.out.println(todoText);
    }
}