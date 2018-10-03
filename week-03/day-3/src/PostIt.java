//Create a PostIt class that has
//        a backgroundColor
//        a text on it
//        a textColor
//        Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"

 class PostitC {

    String text;
    String backgroundColor;
    String textColor;


    public PostitC() {
    }

    public PostitC(String text, String backgroundColor, String textColor) {
        this.text = text;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
    }
}

public class PostIt {

    public static void main(String[] args) {

        PostitC idea1 = new PostitC();
        idea1.backgroundColor = "orange";
        idea1.text = "idea1";
        idea1.textColor = "blue";
        System.out.println(idea1.text);

        PostitC awesome = new PostitC("Awesome", "pink", "black");
        System.out.println(awesome);

        PostitC superb = new PostitC("Superb!", "yellow", "green");
        System.out.println(superb);


    }

}

