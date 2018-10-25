package w3d2;

public class ReversedLine {

    public static void main(String[] args) {

        String line = "johA";

        String lineReversed = "";

        for (int j = 0; j < line.length(); j++) {
            lineReversed+=line.charAt(line.length() - 1 - j);
        }

        System.out.println(lineReversed);
    }


}
