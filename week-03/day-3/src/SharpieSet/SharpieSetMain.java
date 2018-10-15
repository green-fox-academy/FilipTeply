package SharpieSet;

public class SharpieSetMain {

    public static void main(String[] args) {

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
