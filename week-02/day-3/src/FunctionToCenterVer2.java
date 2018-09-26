
import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenterVer2 {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int increment = 20;

        toCenter(graphics, 50,50, increment);

    }

    public static void toCenter(Graphics gra, int x, int y, int increment) {


        for (int i = 0; i < WIDTH; i+=increment) {
            gra.drawLine(i,0 , WIDTH-i, HEIGHT);
        }

        for (int i = 0; i < HEIGHT; i+=increment) {
            gra.drawLine(0, i, WIDTH, HEIGHT - i);
        }
    }



//        for (int i = 0; i < HEIGHT/increment; i++) {
//                    x = x + increment*i;
//
//            for (int j = 0; j < WIDTH/increment; j++) {
//                gra.drawLine(x + i*increment,y + j*increment, WIDTH/2, HEIGHT/2);
//            }
//        }




 //   }



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