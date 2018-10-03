//Create a PostIt class that has
//        a backgroundColor
//        a text on it
//        a textColor
//        Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"

import javafx.geometry.Pos;

public class MainPostIt {

    public static void main(String[] args) {

        PostIt idea1 = new PostIt();
        System.out.println(idea1);

        PostIt awesome = new PostIt();
        System.out.println(awesome);
    }

}
