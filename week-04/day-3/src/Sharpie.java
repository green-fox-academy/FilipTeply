
//Create Sharpie class
//We should know about each sharpie their color (which should be a string),
// width (which will be a floating point number), inkAmount (another floating point number)
//        When creating one, we need to specify the color and the width
//        Every sharpie is created with a default 100 as inkAmount
//        We can use() the sharpie objects
//        which decreases inkAmount

public class Sharpie {

    String color;
    float width;
    float inkAmount = 100;
    //?why not 100f required?

    public Sharpie() {
    }

    public Sharpie(String color, float width, float inkAmount) {
        this(); //actually when this() must be used ??
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public float use() {
        System.out.println("Using sharpie..." /*+ name*/);
        inkAmount--;
        return this.inkAmount;
    }

    public static void main(String[] args) {

        System.out.println();

        Sharpie sharpSharpie = new Sharpie();
        Sharpie bluntSharpie = new Sharpie("blue",33, 150);

        sharpSharpie.use();
        System.out.println(sharpSharpie.inkAmount);
        bluntSharpie.use();
        bluntSharpie.use();
        System.out.println(bluntSharpie.inkAmount);
        System.out.println(bluntSharpie.width);


    }

}

