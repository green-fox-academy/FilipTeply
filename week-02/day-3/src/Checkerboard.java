
import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

    int size = 40;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if ((i+j)%2 == 0) {

                    blackSquare(graphics, size*j, size*i, size);

                }

                else  {

                    whiteSquare(graphics, size*j, size*i, size);

                }

            }
        }

        }


    public static void whiteSquare(Graphics gra, int x, int y, int size){

            gra.setColor(Color.WHITE);
            gra.fillRect(x,y, size, size);

        }

    public static void blackSquare(Graphics gra, int x, int y, int size){

        gra.setColor(Color.BLACK);
        gra.fillRect(x,y, size, size);

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