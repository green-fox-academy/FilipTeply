
import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

drawRainbowSquare(graphics, 100);

    }


    public static void drawRainbowSquare(Graphics gra, int size) {


        gra.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
        gra.fillRect(WIDTH/2-size/2, HEIGHT/2 - size/2, size, size);

//Basic rainbow colors: Roy G. Biv (red, orange, yellow, green, blue, indigo and violet)
        //next version of the exercise feed an ArrayList or Array with picked colors and RANDOMLY choose from them
//        for (int i = 0; i <ArrayList.size() ; i++) {
//
//            get(Math.random()*ArrayList.size());

        }








    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}